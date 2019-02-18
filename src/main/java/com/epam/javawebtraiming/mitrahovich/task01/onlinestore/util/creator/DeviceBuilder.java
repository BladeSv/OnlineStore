package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.creator;

import java.util.ArrayList;
import java.util.List;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.Тelevision;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.type.DeviceType;

public class DeviceBuilder {
	private static DeviceCreator deviceCreator = new DeviceCreator();

	private DeviceBuilder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Device newInstans() {

		return deviceCreator.newInstans();
	}

	private static class DeviceCreator {

		private Device device;
		private static int id = 1;

		public DeviceCreator() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Device newInstans() {
			switch (((int) Math.random() * 2 + 1)) {
			case 1:
				device = new MobilePhone(id, DeviceType.valueOf("MOBILE_PHONE"), getRandomManufacturer(),
						getRandomModel(), getRandomColor(), getRandomPrice(), getRandomPower(), getRandomWeight(),
						getRandomDisplayDiagonal(), getRandomDisplayResolution(), getRandomCpu(), getRandomFrequency(),
						getRandomRam(), getRandomOperatingSystem(), getRandomBatteryCapacity(),
						getRandomMobileConnection());
				id++;
				break;

			case 2:
				device = new Laptop(id, DeviceType.valueOf("LAPTOP"), getRandomManufacturer(), getRandomModel(),
						getRandomColor(), getRandomPrice(), getRandomPower(), getRandomWeight(),
						getRandomDisplayDiagonal(), getRandomDisplayResolution(), getRandomCpu(), getRandomFrequency(),
						getRandomRam(), getRandomOperatingSystem(), getRandomBatteryCapacity(), getHddType(),
						getHddCapacity());
				id++;
				break;
			case 3:

				device = new Тelevision(id, DeviceType.valueOf("LAPTOP"), getRandomManufacturer(), getRandomModel(),
						getRandomColor(), getRandomPrice(), getRandomPower(), getRandomWeight(),
						getRandomDisplayDiagonal(), getRandomDisplayResolution(), getDisplayType());
				id++;
				break;
			}

			return device;
		}

		private String getRandomManufacturer() {
			String manufacturer = "";
			List<String> manufacturerBase = new ArrayList<>();
			manufacturerBase.add("Huawei");
			manufacturerBase.add("LG");
			manufacturerBase.add("Xiaomi");
			manufacturerBase.add("HP");
			manufacturerBase.add("Apple");
			manufacturer = manufacturerBase.get((int) (Math.random() * manufacturerBase.size()));
			return manufacturer;
		}

		private String getRandomModel() {
			String model = "model";
			model += ((int) (Math.random() * 100));
			return model;
		}

		private String getRandomColor() {
			String color = "";
			List<String> colorBase = new ArrayList<>();
			colorBase.add("Black");
			colorBase.add("White");
			colorBase.add("Silver");
			colorBase.add("Red");
			colorBase.add("Green");
			colorBase.add("Yellow");
			color = colorBase.get((int) (Math.random() * colorBase.size()));
			return color;
		}

		private double getRandomPrice() {
			double price = 0;
			price = Math.round((Math.random() * 1000 + 250) * 100) / 100;
			return price;
		}

		private double getRandomPower() {
			double power = 0;
			power = Math.round((Math.random() * 1000 + 50) * 100) / 100;
			return power;
		}

		private double getRandomWeight() {
			double weight = 0;
			weight = Math.round((Math.random() * 1000 + 50) * 100) / 100;
			return weight;
		}

		private double getRandomDisplayDiagonal() {
			double diagonal = 0;
			diagonal = Math.round((Math.random() * 45 + 5) * 100) / 100;

			return diagonal;
		}

		private String getRandomDisplayResolution() {
			String resolution = "";
			resolution = resolution + ((int) (Math.random() * 50 + 3));
			return resolution;
		}

		private String getRandomCpu() {
			String cpu = "";
			List<String> cpuBase = new ArrayList<>();
			cpuBase.add("MediaTek Helio A22");
			cpuBase.add("HiSilicon Kirin 970");
			cpuBase.add("Intel Celeron N4000");
			cpuBase.add("Intel Core i7 8850H");
			cpu = cpuBase.get((int) (Math.random() * cpuBase.size()));
			return cpu;
		}

		private int getRandomFrequency() {
			int frequency = 0;
			frequency = ((int) (Math.random() * 2000 + 1000));

			return frequency;
		}

		private int getRandomRam() {
			int ram = 0;
			ram = ((int) (Math.random() * 7 + 1));
			return ram;
		}

		private String getRandomOperatingSystem() {
			String operatingSystem = "";
			List<String> operatingSystemBase = new ArrayList<>();
			operatingSystemBase.add("Windows 7");
			operatingSystemBase.add("Windows XP");
			operatingSystemBase.add("Windows 10");
			operatingSystemBase.add("Android 8.1 Oreo");
			operatingSystemBase.add("Ubuntu");
			operatingSystemBase.add("Mac OS");
			operatingSystem = operatingSystemBase.get((int) (Math.random() * operatingSystemBase.size()));

			return operatingSystem;
		}

		private int getRandomBatteryCapacity() {
			int batteryCapacity = 0;
			batteryCapacity = ((int) (Math.random() * 7000 + 1000));

			return batteryCapacity;
		}

		private String getRandomMobileConnection() {
			String mobileConnection = "G";
			mobileConnection += ((int) (Math.random() * 4 + 1));
			return mobileConnection;
		}

		private String getHddType() {
			String hddType = "";
			List<String> hddTypeBase = new ArrayList<>();
			hddTypeBase.add("HDD");
			hddTypeBase.add("SDD");
			hddTypeBase.add("SSDD");
			hddTypeBase.add("eMMC");
			hddType = hddTypeBase.get((int) (Math.random() * hddTypeBase.size()));
			return hddType;
		}

		private int getHddCapacity() {
			int hddCapacity = 0;
			hddCapacity = ((int) (Math.random() * 400 + 100));
			return hddCapacity;

		}

		private String getDisplayType() {
			String displayType = "";
			List<String> displayTypeBase = new ArrayList<>();
			displayTypeBase.add("IPS");
			displayTypeBase.add("VA");
			displayTypeBase.add("OLED");
			displayTypeBase.add("LCD");
			displayTypeBase.add("PSL");
			displayType = displayTypeBase.get((int) (Math.random() * displayTypeBase.size()));

			return displayType;
		}
	}
}
