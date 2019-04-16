package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.DOM;

import java.io.IOException;
import java.math.BigDecimal;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Тelevision;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.OnlineStoreException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.DeviceBaseEnum;

public class DeviceBaseDOMParser {

	private static final Logger LOGGER;

	private static DeviceBaseDOMParser baseDOMParser;
	private Base<Device> deviceBase;
	private DocumentBuilder documentBuilder;

	static {
		LOGGER = Logger.getRootLogger();

	}

	private DeviceBaseDOMParser() {
		this.deviceBase = new Base();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			documentBuilder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			LOGGER.error("Parser configuration error: " + e);
		}
	}

	public static DeviceBaseDOMParser getUniqueInstance() {

		if (baseDOMParser == null) {
			baseDOMParser = new DeviceBaseDOMParser();
		}

		return baseDOMParser;
	}

	public void createDeviceBase(String fileName) {
		Document document = null;
		try {
			document = documentBuilder.parse(fileName);
			Element root = document.getDocumentElement();
			NodeList deviceList = root.getChildNodes();
			for (int i = 0; i < deviceList.getLength(); i++) {
				Node node = deviceList.item(i);
				if (node instanceof Element) {
					Element deviceElement = (Element) node;
					Device device = buildDevice(deviceElement);
					deviceBase.add(device);
				}
			}
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Base getBase() {
		return deviceBase;
	}

	private Device buildDevice(Element deviceElement) {
		String name = deviceElement.getNodeName();
		DeviceBaseEnum temp = DeviceBaseEnum.valueOf(name.toUpperCase());
		Device device = null;
		try {
			switch (temp) {
			case TELEVISION:
				Тelevision television = new Тelevision();
				television.setPower(
						Double.parseDouble(getElementTextContent(deviceElement, DeviceBaseEnum.POWER.toString())));
				television.setDisplayDiagonal(Double
						.parseDouble(getElementTextContent(deviceElement, DeviceBaseEnum.DISPLAY_DIAGONAL.toString())));
				television.setDisplayType(getElementTextContent(deviceElement, DeviceBaseEnum.DISPLAY_TYPE.toString()));
				device = television;

				break;
			case MOBILE_PHONE:

				MobilePhone mobilePhone = new MobilePhone();
				mobilePhone.setPower(
						Double.parseDouble(getElementTextContent(deviceElement, DeviceBaseEnum.POWER.toString())));
				mobilePhone.setDisplayDiagonal(Double
						.parseDouble(getElementTextContent(deviceElement, DeviceBaseEnum.DISPLAY_DIAGONAL.toString())));
				mobilePhone.setCpu(getElementTextContent(deviceElement, DeviceBaseEnum.CPU.toString()));
				mobilePhone
						.setRam(Integer.parseInt(getElementTextContent(deviceElement, DeviceBaseEnum.RAM.toString())));
				mobilePhone.setBatteryCapacity(Integer
						.parseInt(getElementTextContent(deviceElement, DeviceBaseEnum.BATTARY_CAPACITY.toString())));
				mobilePhone.setMobileConnection(
						getElementTextContent(deviceElement, DeviceBaseEnum.MOBILE_CONNECTION.toString()));
				device = mobilePhone;

				break;
			case LAPTOP:
				Laptop laptop = new Laptop();
				laptop.setPower(
						Double.parseDouble(getElementTextContent(deviceElement, DeviceBaseEnum.POWER.toString())));
				laptop.setDisplayDiagonal(Double
						.parseDouble(getElementTextContent(deviceElement, DeviceBaseEnum.DISPLAY_DIAGONAL.toString())));
				laptop.setCpu(getElementTextContent(deviceElement, DeviceBaseEnum.CPU.toString()));
				laptop.setRam(Integer.parseInt(getElementTextContent(deviceElement, DeviceBaseEnum.RAM.toString())));
				laptop.setBatteryCapacity(Integer
						.parseInt(getElementTextContent(deviceElement, DeviceBaseEnum.BATTARY_CAPACITY.toString())));
				laptop.setHddCapacity(
						Integer.parseInt(getElementTextContent(deviceElement, DeviceBaseEnum.HDD_CAPACITY.toString())));
				device = laptop;
				break;
			}

			device.setId(Integer.parseInt(deviceElement.getAttribute(DeviceBaseEnum.ID.toString())));
			device.setType(DeviceType.valueOf(getElementTextContent(deviceElement, DeviceBaseEnum.TYPE.toString())));
			device.setManufacturer(getElementTextContent(deviceElement, DeviceBaseEnum.MANAFACTURER.toString()));
			device.setModel(getElementTextContent(deviceElement, DeviceBaseEnum.MODEL.toString()));
			device.setColor(getElementTextContent(deviceElement, DeviceBaseEnum.COLOR.toString()));
			device.setPrice(new BigDecimal(getElementTextContent(deviceElement, DeviceBaseEnum.PRICE.toString())));

		} catch (OnlineStoreException e) {
			LOGGER.warn("DOM Parser device " + e.getStackTrace());
		}
		return device;
	}

	private static String getElementTextContent(Element element, String elementName) {
		NodeList nodeList = element.getElementsByTagName(elementName);
		Node node = nodeList.item(0);
		String text = node.getTextContent();
		return text;
	}
}
