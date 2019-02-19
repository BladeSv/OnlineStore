package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.creator.random;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaterRandomField {

	private Random rd = new Random();

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

		return "model" + rd.nextInt(100);
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

		return new BigDecimal(rd.nextDouble() * 1000 + 250);
	}

	public double getRandomPower() {

		return (rd.nextDouble() * 1000 + 50);
	}

	public double getRandomDisplayDiagonal() {
		double diagonal = 0;
		diagonal = (rd.nextDouble() * 45 + 5);
		;

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

		return rd.nextInt(7) + 1;
	}

	public int getRandomBatteryCapacity() {

		return rd.nextInt(7000) + 1000;
	}

	public String getRandomMobileConnection() {

		return "G" + (rd.nextInt(4) + 1);
	}

	public int getHddCapacity() {

		return rd.nextInt(400) + 100;

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
