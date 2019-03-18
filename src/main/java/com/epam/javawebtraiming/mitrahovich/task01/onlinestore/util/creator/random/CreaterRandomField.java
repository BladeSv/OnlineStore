package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.creator.random;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaterRandomField {

	private Random rd = new Random();
	private static final int MODEL_RANGE = 100;
	private static final int MIN_SIZE_PRICE = 250;
	private static final int MAX_SIZE_PRICE = 1000;
	private static final int MIN_SIZE_POWER = 50;
	private static final int MAX_SIZE_POWER = 1000;
	private static final int MIN_SIZE_DISPLAY = 5;
	private static final int MAX_SIZE_DISPLAY = 45;

	private static final int MIN_SIZE_RAM = 1;
	private static final int MAX_SIZE_RAM = 7;
	private static final int MIN_SIZE_BATTERY = 1000;
	private static final int MAX_SIZE_BATTERY = 7000;
	private static final int MIN_SIZE_MOBILE_CONECTION = 1;
	private static final int MAX_SIZE_MOBILE_CONECTION = 4;
	private static final int MIN_SIZE_HDD_CAPACITY = 100;
	private static final int MAX_SIZE_HDD_CAPACIT = 400;

	public Random getRd() {
		return rd;
	}

	public String getRandomManufacturer() {

		List<String> manufacturerBase = new ArrayList<>();
		manufacturerBase.add("Huawei");
		manufacturerBase.add("LG");
		manufacturerBase.add("Xiaomi");
		manufacturerBase.add("HP");
		manufacturerBase.add("Apple");
		return manufacturerBase.get(rd.nextInt(manufacturerBase.size()));
	}

	public String getRandomModel() {

		return "model" + rd.nextInt(MODEL_RANGE);
	}

	public String getRandomColor() {
		List<String> colorBase = new ArrayList<>();
		colorBase.add("Black");
		colorBase.add("White");
		colorBase.add("Silver");
		colorBase.add("Red");
		colorBase.add("Green");
		colorBase.add("Yellow");

		return colorBase.get(rd.nextInt(colorBase.size()));
	}

	public BigDecimal getRandomPrice() {

		return new BigDecimal(rd.nextDouble() * MAX_SIZE_PRICE + MIN_SIZE_PRICE);
	}

	public double getRandomPower() {

		return (rd.nextDouble() * MAX_SIZE_POWER + MIN_SIZE_POWER);
	}

	public double getRandomDisplayDiagonal() {
		double diagonal = 0;
		diagonal = (rd.nextDouble() * MAX_SIZE_DISPLAY + MIN_SIZE_DISPLAY);

		return diagonal;
	}

	public String getRandomCpu() {

		List<String> cpuBase = new ArrayList<>();
		cpuBase.add("MediaTek Helio A22");
		cpuBase.add("HiSilicon Kirin 970");
		cpuBase.add("Intel Celeron N4000");
		cpuBase.add("Intel Core i7 8850H");

		return cpuBase.get(rd.nextInt(cpuBase.size()));

	}

	public int getRandomRam() {

		return rd.nextInt(MAX_SIZE_RAM) + MIN_SIZE_RAM;
	}

	public int getRandomBatteryCapacity() {

		return rd.nextInt(MAX_SIZE_BATTERY) + MIN_SIZE_BATTERY;
	}

	public String getRandomMobileConnection() {

		return "G" + (rd.nextInt(MAX_SIZE_MOBILE_CONECTION) + MIN_SIZE_MOBILE_CONECTION);
	}

	public int getHddCapacity() {

		return rd.nextInt(MAX_SIZE_HDD_CAPACIT) + MIN_SIZE_HDD_CAPACITY;

	}

	public String getDisplayType() {

		List<String> displayTypeBase = new ArrayList<>();
		displayTypeBase.add("IPS");
		displayTypeBase.add("VA");
		displayTypeBase.add("OLED");
		displayTypeBase.add("LCD");
		displayTypeBase.add("PSL");

		return displayTypeBase.get(rd.nextInt(displayTypeBase.size()));

	}
}
