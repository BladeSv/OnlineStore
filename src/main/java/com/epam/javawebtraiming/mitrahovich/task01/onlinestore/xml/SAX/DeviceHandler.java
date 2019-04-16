package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.SAX;

import java.math.BigDecimal;
import java.util.EnumSet;

import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

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

public class DeviceHandler extends DefaultHandler {

	public static final Logger LOGGER;

	static {
		LOGGER = Logger.getRootLogger();
	}

	private Base<Device> deviceBase;
	private Device choseDevice;
	private DeviceBaseEnum choseEnum;
	private EnumSet<DeviceBaseEnum> types;
	private EnumSet<DeviceBaseEnum> fields;

	public DeviceHandler() {
		deviceBase = new Base();
		types = EnumSet.range(DeviceBaseEnum.TELEVISION, DeviceBaseEnum.LAPTOP);
		fields = EnumSet.range(DeviceBaseEnum.ID, DeviceBaseEnum.HDD_CAPACITY);
	}

	public Base getDeviceBase() {
		return deviceBase;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attrs) {

		if (DeviceBaseEnum.TELEVISION.toString().equalsIgnoreCase(localName)) {
			choseDevice = new Тelevision();

		} else if (DeviceBaseEnum.MOBILE_PHONE.toString().equalsIgnoreCase(localName)) {
			choseDevice = new MobilePhone();

		} else if (DeviceBaseEnum.LAPTOP.toString().equalsIgnoreCase(localName)) {
			choseDevice = new Laptop();

		} else {
			DeviceBaseEnum temp = DeviceBaseEnum.valueOf(localName.toUpperCase());
			if (fields.contains(temp)) {
				choseEnum = temp;
			}
		}
		if (attrs.getLength() == 1) {
			try {
				choseDevice.setId(Integer.parseInt(attrs.getValue(0)));
			} catch (WrongSetIdException | NumberFormatException e) {
				LOGGER.warn("SAX parser XML " + e.getStackTrace());

			}

		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		if (types.contains(DeviceBaseEnum.valueOf(localName.toUpperCase()))) {
			deviceBase.add(choseDevice);
		}
	}

	@Override
	public void characters(char[] ch, int start, int lenght) {

		String s = new String(ch, start, lenght).trim();

		if (choseEnum != null) {
			try {
				if (choseEnum == DeviceBaseEnum.TYPE) {
					choseDevice.setType(DeviceType.valueOf(s));

				} else if (choseEnum == DeviceBaseEnum.MANUFACTURER) {
					choseDevice.setManufacturer(s);

				} else if (choseEnum == DeviceBaseEnum.MODEL) {
					choseDevice.setModel(s);
				} else if (choseEnum == DeviceBaseEnum.COLOR) {
					choseDevice.setColor(s);
				} else if (choseEnum == DeviceBaseEnum.COLOR) {
					choseDevice.setColor(s);
				} else if (choseEnum == DeviceBaseEnum.PRICE) {
					choseDevice.setPrice(new BigDecimal(s));
				}

				if (choseDevice instanceof DisplayElectricDevice) {

					if (choseEnum == DeviceBaseEnum.POWER) {

						((DisplayElectricDevice) choseDevice).setPower(Double.parseDouble(s));

					} else if (choseEnum == DeviceBaseEnum.DISPLAY_DIAGONAL) {
						((DisplayElectricDevice) choseDevice).setDisplayDiagonal(Double.parseDouble(s));

					}
				}

				if (choseDevice instanceof PortableCpuDisplayElectricDevice) {

					if (choseEnum == DeviceBaseEnum.CPU) {
						((PortableCpuDisplayElectricDevice) choseDevice).setCpu(s);
					} else if (choseEnum == DeviceBaseEnum.RAM) {
						((PortableCpuDisplayElectricDevice) choseDevice).setRam(Integer.parseInt(s));
					} else if (choseEnum == DeviceBaseEnum.BATTERY_CAPACITY) {
						((PortableCpuDisplayElectricDevice) choseDevice).setBatteryCapacity(Integer.parseInt(s));
					}
				}

				if (choseDevice instanceof Тelevision) {

					if (choseEnum == DeviceBaseEnum.DISPLAY_TYPE) {
						((Тelevision) choseDevice).setDisplayType(s);
					}
				}

				if (choseDevice instanceof Laptop) {

					if (choseEnum == DeviceBaseEnum.HDD_CAPACITY) {
						((Laptop) choseDevice).setHddCapacity(Integer.parseInt(s));
					}
				}

				if (choseDevice instanceof MobilePhone) {
					if (choseEnum == DeviceBaseEnum.MOBILE_CONNECTION) {
						((MobilePhone) choseDevice).setMobileConnection(s);
					}
				}
			} catch (OnlineStoreException e) {
				LOGGER.warn("SAX parser XML " + e.getStackTrace());
			}
		}
		choseEnum = null;
	}
}
