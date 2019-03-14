package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetBatteryCapacityException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetColorException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetCpuException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetIdException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetManufacturerException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetMobileConnectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetModelException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetPowerException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetPriceException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetRamException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetScreenDiagonalException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetTypeException;

/**
 * @author Mitrahovich
 *
 */
public class MobilePhoneTest {

	private MobilePhone phone;

	static Stream<Integer> intValue() {
		return Stream.of(0, -1);
	}

	@Nested
	@Tag("positive")
	class PositiveTest {
		@BeforeEach
		public void init() {

			phone = new MobilePhone();
		}

		@Test
		public void testPositiveNotNull() {
			assertNotNull(phone);

		}

		@Test
		public void testPositiveSetId() throws WrongSetIdException {
			int expected = 1;
			phone.setId(expected);
			assertEquals(expected, phone.getId());
		}

		@Test
		public void testPositiveSetType() throws WrongSetTypeException {

			DeviceType expected = DeviceType.MOBILE_PHONE;
			phone.setType(expected);
			assertEquals(expected, phone.getType());
		}

		@Test
		public void testPositiveSetManufacturer() throws WrongSetManufacturerException {
			String expected = "Xiaomi";
			phone.setManufacturer(expected);
			assertEquals(expected, phone.getManufacturer());
		}

		@Test
		public void testPositiveSetModel() throws WrongSetModelException {
			String expected = "Redmi 6A";
			phone.setModel(expected);
			assertEquals(expected, phone.getModel());
		}

		@Test
		public void testPositiveSetColor() throws WrongSetColorException {
			String expected = "Black";
			phone.setColor(expected);
			assertEquals(expected, phone.getColor());
		}

		public void testPositiveSetPrice() throws WrongSetPriceException {
			BigDecimal expected = new BigDecimal(250.50);
			phone.setPrice(expected);
			assertEquals(expected, phone.getPrice());
		}

		public void testPositiveSetPower() throws WrongSetPowerException {
			double expected = 5.1;
			phone.setPower(expected);
			assertEquals(expected, phone.getPower());
		}

		public void testPositiveSetisplayDiagona() throws WrongSetScreenDiagonalException {
			double expected = 4.5;
			phone.setDisplayDiagonal(expected);
			assertEquals(expected, phone.getDisplayDiagonal());
		}

		@Test
		public void testPositiveSetCpu() throws WrongSetCpuException {
			String expected = "MediaTek Helio A22";
			phone.setCpu(expected);
			assertEquals(expected, phone.getCpu());
		}

		@Test
		public void testPositiveSetRam() throws WrongSetRamException {
			int expected = 4000;
			phone.setRam(expected);
			assertEquals(expected, phone.getRam());
		}

		@Test
		public void testPositiveSetBatteryCapacity() throws WrongSetBatteryCapacityException {
			int expected = 5000;
			phone.setBatteryCapacity(expected);
			assertEquals(expected, phone.getBatteryCapacity());
		}

		@Test
		public void testPositiveSetMobileConnection() throws WrongSetMobileConnectionException {
			String expected = "4G";
			phone.setMobileConnection(expected);
			assertEquals(expected, phone.getMobileConnection());
		}

		@Test
		public void testPositivecopy() {
			MobilePhone expected = new MobilePhone(1, DeviceType.MOBILE_PHONE, "Xiaomi", "Redmi 6A", "Black",
					new BigDecimal(250.50), 5, 5.45, "MediaTek Helio A22", 2, 3000, "4G");

			assertEquals(expected, expected.copy());
		}

	}

	@Nested
	@Tag("negative")
	class NegativeTest {
		@BeforeEach
		public void init() {
			phone = new MobilePhone(1, DeviceType.MOBILE_PHONE, "Xiaomi", "Redmi 6A", "Black", new BigDecimal(250.50),
					5, 5.45, "MediaTek Helio A22", 2, 3000, "4G");

		}

		@Test
		public void testNegativeSetId() throws WrongSetIdException {
			int expected = 3;
			assertNotEquals(expected, phone.getId());
		}

		@Test
		public void testNegativeSetType() throws WrongSetTypeException {

			DeviceType expected = DeviceType.LAPTOP;

			assertNotEquals(expected, phone.getType());
		}

		@Test
		public void testNegativeSetManufacturer() throws WrongSetManufacturerException {
			String expected = "miaomi";

			assertNotEquals(expected, phone.getManufacturer());
		}

		@Test
		public void testNegativeSetModel() throws WrongSetModelException {
			String expected = "Redmi";

			assertNotEquals(expected, phone.getModel());
		}

		@Test
		public void testNegativeSetColor() throws WrongSetColorException {
			String expected = "White";

			assertNotEquals(expected, phone.getColor());
		}

		public void testNegativeSetPrice() throws WrongSetPriceException {
			BigDecimal expected = new BigDecimal(1050.50);

			assertNotEquals(expected, phone.getPrice());
		}

		public void testNegativeSetPower() throws WrongSetPowerException {
			double expected = 5.0;

			assertNotEquals(expected, phone.getPower());
		}

		public void testNegativeSetisplayDiagona() throws WrongSetScreenDiagonalException {
			double expected = 5.5;

			assertNotEquals(expected, phone.getDisplayDiagonal());
		}

		@Test
		public void testNegativeSetCpu() throws WrongSetCpuException {
			String expected = "MediaTek";

			assertNotEquals(expected, phone.getCpu());
		}

		@Test
		public void testNegativeSetRam() throws WrongSetRamException {
			int expected = 2000;

			assertNotEquals(expected, phone.getRam());
		}

		@Test
		public void testNegativeSetBatteryCapacity() throws WrongSetBatteryCapacityException {
			int expected = 1500;

			assertNotEquals(expected, phone.getBatteryCapacity());
		}

		@Test
		public void testNegativeSetMobileConnection() throws WrongSetMobileConnectionException {
			String expected = "5G";

			assertNotEquals(expected, phone.getMobileConnection());
		}

	}

	@Nested
	@Tag("exception")
	class ExceptionTest {
		@BeforeEach
		public void init() {

			phone = new MobilePhone();
		}

		@ParameterizedTest
		@MethodSource("intValue")
		public void testExceptionSetId(Integer arg) throws WrongSetIdException {

			assertThrows(WrongSetIdException.class, () -> phone.setId(arg));
		}

	}
}
