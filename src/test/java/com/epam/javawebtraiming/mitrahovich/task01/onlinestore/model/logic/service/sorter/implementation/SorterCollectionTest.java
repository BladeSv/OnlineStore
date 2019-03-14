package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sorter.implementation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.exception.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.implementation.DaoStoreBaseCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.comparator.SortByPriceDecrease;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.comparator.SortByPriceIncrease;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.service.CantSortException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.DeviceBaseForTest;

public class SorterCollectionTest {

	private DeviceBaseForTest db;
	private SorterCollection sorter;
	private Comparator<Device> comp;

	@BeforeEach
	public void BeforeTest() {
		db = new DeviceBaseForTest();
		sorter = new SorterCollection();
	}

	@Test
	public void testSortPriceDecrease() throws NotAddElementBaseException, CantSortException {
		comp = new SortByPriceDecrease();

		Base<Device> base = new Base<>();

		base.add(db.d2);
		base.add(db.d3);
		base.add(db.d1);
		DaoBase<Device> expected = new DaoStoreBaseCollection(base);

		assertArrayEquals(expected.toArray(), sorter.sort(db.getDaoBase(), comp).toArray());

	}

	@Test
	public void testSortPriceIncrease() throws NotAddElementBaseException, CantSortException {

		comp = new SortByPriceIncrease();
		Base<Device> base = new Base<>();

		base.add(db.d1);
		base.add(db.d3);
		base.add(db.d2);
		DaoBase<Device> expected = new DaoStoreBaseCollection(base);

		assertArrayEquals(expected.toArray(), sorter.sort(db.getDaoBase(), comp).toArray());

	}
}
