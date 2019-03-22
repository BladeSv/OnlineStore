package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.finder.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.comparator.SortByPriceDecrease;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.comparator.SortByPriceIncrease;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.DeviceBaseForTest;

public class FinderCollectionTest {

	private DeviceBaseForTest db;
	private FinderCollection finder;
	private Comparator<Device> comp;

	@BeforeEach
	public void BeforeTest() {
		db = new DeviceBaseForTest();
		finder = new FinderCollection();
	}

	public void testFind() {

	}

	@Test
	public void testFindMaxPricePosivive() {
		comp = new SortByPriceIncrease();
		Device expected = db.d2;
		assertEquals(expected, finder.find(db.getDaoBase(), comp));

	}

	@Test
	public void testMaxPriceNegative() {
		comp = new SortByPriceIncrease();
		Device expected = db.d1;
		assertNotEquals(expected, finder.find(db.getDaoBase(), comp));

	}

	@Test
	public void testMinPrice() {
		comp = new SortByPriceDecrease();
		Device expected = db.d1;
		assertEquals(expected, finder.find(db.getDaoBase(), comp));

	}

	@Test
	public void testMinPriceNegative() {
		comp = new SortByPriceIncrease();
		Device expected = db.d3;
		assertNotEquals(expected, finder.find(db.getDaoBase(), comp));

	}
}
