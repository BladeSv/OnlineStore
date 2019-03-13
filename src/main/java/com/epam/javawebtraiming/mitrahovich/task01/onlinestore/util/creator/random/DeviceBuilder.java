package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.creator.random;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Тelevision;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;

public class DeviceBuilder {
	private static CreaterRandomField dc = new CreaterRandomField();

	private static int id_count = 0;
	private static Device device;

	private DeviceBuilder() {
		super();

	}

	private static int getId() {
		return ++id_count;
	}

	public static Device newInstans() {

		switch (dc.getRd().nextInt(3)) {
		case 0:

			device = new MobilePhone(getId(), DeviceType.valueOf("MOBILE_PHONE"), dc.getRandomManufacturer(),
					dc.getRandomModel(), dc.getRandomColor(), dc.getRandomPrice(), dc.getRandomPower(),
					dc.getRandomDisplayDiagonal(), dc.getRandomCpu(), dc.getRandomRam(), dc.getRandomBatteryCapacity(),
					dc.getRandomMobileConnection());
			break;

		case 1:
			device = new Laptop(getId(), DeviceType.valueOf("LAPTOP"), dc.getRandomManufacturer(), dc.getRandomModel(),
					dc.getRandomColor(), dc.getRandomPrice(), dc.getRandomPower(), dc.getRandomDisplayDiagonal(),
					dc.getRandomCpu(), dc.getRandomRam(), dc.getRandomBatteryCapacity(), dc.getHddCapacity());
			break;
		case 2:

			device = new Тelevision(getId(), DeviceType.valueOf("TV"), dc.getRandomManufacturer(), dc.getRandomModel(),
					dc.getRandomColor(), dc.getRandomPrice(), dc.getRandomPower(), dc.getRandomDisplayDiagonal(),
					dc.getDisplayType());
			break;
		}

		return device;
	}

}
