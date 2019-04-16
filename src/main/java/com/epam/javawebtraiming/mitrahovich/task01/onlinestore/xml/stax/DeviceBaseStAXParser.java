package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.stax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.EnumSet;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.log4j.Logger;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Тelevision;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.DisplayElectricDevice;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.PortableCpuDisplayElectricDevice;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.OnlineStoreException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetIdException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.DeviceBaseEnum;

public class DeviceBaseStAXParser {

	private static final Logger LOGGER;

	private static DeviceBaseStAXParser uniqueInstance;

	private XMLInputFactory inputXMLFactory;
	private EnumSet<DeviceBaseEnum> DeviceEnumTypes;
	private Base<Device> devaceBase;

	static {
		LOGGER = Logger.getRootLogger();

	}

	private DeviceBaseStAXParser() {
		inputXMLFactory = XMLInputFactory.newInstance();
		DeviceEnumTypes = EnumSet.range(DeviceBaseEnum.TELEVISION, DeviceBaseEnum.LAPTOP);
		devaceBase = new Base<>();
	}

	public static DeviceBaseStAXParser getUniqueInstance() {

		if (uniqueInstance == null) {
			uniqueInstance = new DeviceBaseStAXParser();
		}

		return uniqueInstance;
	}

	public Base getBase() {
		return devaceBase;
	}

	public void createDeviceBase(String filename) {

		FileInputStream fileInputStream = null;
		XMLStreamReader reader;
		String name;
		try {
			fileInputStream = new FileInputStream(new File(filename));
			reader = inputXMLFactory.createXMLStreamReader(fileInputStream);

			while (reader.hasNext()) {
				int type = reader.next();

				if (type == XMLStreamConstants.START_ELEMENT) {
					name = reader.getLocalName();

					if (DeviceEnumTypes.contains(DeviceBaseEnum.valueOf(name.toUpperCase()))) {
						Device device = buildDevice(reader);
						devaceBase.add(device);
					}
				}
			}
		} catch (XMLStreamException e) {
			LOGGER.error("stax parsing error!" + e.getMessage());
		} catch (FileNotFoundException e) {
			LOGGER.error("File " + filename + " not found! " + e.getMessage());
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				LOGGER.error("Impossible close file! " + filename + e);
			}
		}
	}

	private Device buildDevice(XMLStreamReader reader) throws XMLStreamException {

		Device device = null;

		if (reader.getLocalName().equalsIgnoreCase(DeviceBaseEnum.TELEVISION.toString())) {
			device = new Тelevision();

		} else if (reader.getLocalName().equalsIgnoreCase(DeviceBaseEnum.LAPTOP.toString())) {
			device = new Laptop();

		} else if (reader.getLocalName().equalsIgnoreCase(DeviceBaseEnum.MOBILE_PHONE.toString())) {
			device = new MobilePhone();
		}

		try {
			device.setId(Integer.parseInt(reader.getAttributeValue(null, DeviceBaseEnum.ID.toString())));
		} catch (WrongSetIdException | NumberFormatException e) {
			LOGGER.warn("StAX XML parser " + e.getStackTrace());
			e.printStackTrace();
		}

		while (reader.hasNext()) {

			int type = reader.next();

			switch (type) {
			case XMLStreamConstants.START_ELEMENT:
				String name = reader.getLocalName();
				try {
					switch (DeviceBaseEnum.valueOf(name.toUpperCase())) {
					case TYPE:
						device.setType(DeviceType.valueOf(getXMLText(reader)));
						break;
					case MANUFACTURER:
						device.setManufacturer(getXMLText(reader));
						break;
					case MODEL:
						device.setModel(getXMLText(reader));
						break;
					case COLOR:
						device.setColor(getXMLText(reader));
						break;

					case PRICE:
						device.setPrice(new BigDecimal(getXMLText(reader)));
						break;

					case POWER:
						if (device instanceof DisplayElectricDevice) {
							((DisplayElectricDevice) device).setPower(Double.parseDouble(getXMLText(reader)));
						}
						break;
					case DISPLAY_DIAGONAL:
						if (device instanceof DisplayElectricDevice) {
							((DisplayElectricDevice) device).setDisplayDiagonal(Double.parseDouble(getXMLText(reader)));
						}
						break;

					case CPU:
						if (device instanceof PortableCpuDisplayElectricDevice) {
							((PortableCpuDisplayElectricDevice) device).setCpu(getXMLText(reader));
						}
						break;
					case RAM:
						if (device instanceof PortableCpuDisplayElectricDevice) {
							((PortableCpuDisplayElectricDevice) device).setRam(Integer.parseInt(getXMLText(reader)));
						}
						break;
					case BATTERY_CAPACITY:
						if (device instanceof PortableCpuDisplayElectricDevice) {
							((PortableCpuDisplayElectricDevice) device).setRam(Integer.parseInt(getXMLText(reader)));
						}
						break;

					case DISPLAY_TYPE:
						if (device instanceof Тelevision) {
							((Тelevision) device).setDisplayType(getXMLText(reader));
						}
						break;

					case HDD_CAPACITY:
						if (device instanceof Laptop) {
							((Laptop) device).setHddCapacity(Integer.parseInt(getXMLText(reader)));
						}
						break;
					case MOBILE_CONNECTION:
						if (device instanceof MobilePhone) {
							((MobilePhone) device).setMobileConnection(getXMLText(reader));
						}
						break;
					}

				} catch (OnlineStoreException e) {
					LOGGER.warn("StAX XML parser " + e.getStackTrace());
				}
				break;

			case XMLStreamConstants.END_ELEMENT:
				name = reader.getLocalName();
				if (DeviceEnumTypes.contains(DeviceBaseEnum.valueOf(name.toUpperCase()))) {
					return device;
				}
				break;
			}
		}
		throw new XMLStreamException("Unknown element");

	}

	private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
		String text = null;
		if (reader.hasNext()) {
			reader.next();
			text = reader.getText();
		}
		return text;
	}
}
