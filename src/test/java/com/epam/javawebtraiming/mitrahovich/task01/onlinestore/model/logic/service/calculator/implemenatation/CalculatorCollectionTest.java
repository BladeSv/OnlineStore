package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.calculator.implemenatation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.DeviceBaseForTest;

public class CalculatorCollectionTest {
	CalculatorCollectionTest() {
	}

	private DeviceBaseForTest db;
	private CalculatorCollection cal;

	@BeforeEach
	public void BeforeTest() {
		db = new DeviceBaseForTest();
		cal = new CalculatorCollection();
	}

	@Test
	public void testPositiveSumPrice() {

		BigDecimal expected = new BigDecimal("0");

		expected = expected.add(db.d1.getPrice()).add(db.d2.getPrice()).add(db.d3.getPrice());
		assertEquals(expected, cal.sumPrice(db.getDaoBase()));
	}

	public void testNegativeSumPrice() {

		BigDecimal expected = new BigDecimal("0");

		expected = expected.add(db.d1.getPrice()).add(db.d2.getPrice());
		assertNotEquals(expected, cal.sumPrice(db.getDaoBase()));
	}
}
