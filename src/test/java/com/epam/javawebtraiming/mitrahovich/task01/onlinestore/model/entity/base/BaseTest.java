package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotInCollectionException;

/**
 * @author Mitrahovich
 *
 */
public class BaseTest<T> {
	private Base base;

	@BeforeEach
	void init() {
		base = new Base<>();
	}

	@Test
	void testPositiveSet() throws IndexOutOfRangeException {

		Device expected = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0), 31,
				15.6, "Intel Celeron N4000", 8, 7000, 500);
		base.add(expected);
		assertEquals(expected, base.get(0));
	}

	@Test
	void testNegativeSet() throws IndexOutOfRangeException {

		Device expected = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0), 31,
				15.6, "Intel Celeron N4000", 8, 7000, 500);
		Device notExpected = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29", "While",
				new BigDecimal(1440.50), 5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");
		base.add(expected);
		base.add(notExpected);
		assertNotEquals(expected, base.get(1));

	}

	@Test
	void testExceptionSet() throws IndexOutOfRangeException {

		Device expected = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0), 31,
				15.6, "Intel Celeron N4000", 8, 7000, 500);

		base.add(expected);

		assertThrows(IndexOutOfRangeException.class, () -> base.get(1));

	}

	@Test
	void testCheckAdd() throws IndexOutOfRangeException {

		Device expected = null;

		base.add(expected);

		assertEquals(false, base.add(expected));

	}

	@Test
	void testPositiveRevove() throws NotInCollectionException {

		Device expected = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0), 31,
				15.6, "Intel Celeron N4000", 8, 7000, 500);
		Device expected2 = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29", "While",
				new BigDecimal(1440.50), 5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");

		base.add(expected);
		base.add(expected2);
		// System.out.println("expected-" + expected);
		assertEquals(true, base.remove(expected));

	}

	@Test
	void testExceptionRevove() {

		Device expected = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0), 31,
				15.6, "Intel Celeron N4000", 8, 7000, 500);
		Device notExpected = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29", "While",
				new BigDecimal(1440.50), 5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");
		base.add(expected);

		assertAll(() -> assertThrows(NotInCollectionException.class, () -> base.remove(notExpected)),
				() -> assertEquals(false, base.remove(null))

		);

	}

	@Test
	void testPositiveCopy() throws NotCopybleElementException {

		Device expected = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0), 31,
				15.6, "Intel Celeron N4000", 8, 7000, 500);

		Device expected2 = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29", "While",
				new BigDecimal(1440.50), 5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");

		base.add(expected);
		base.add(expected2);

		Base baseCopy = base.copy();

		assertArrayEquals(base.toArray(), baseCopy.toArray());

	}

}
