// package
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.service.logic;
//
// import static org.junit.Assert.assertEquals;
//
// import java.math.BigDecimal;
//
// import org.junit.Before;
// import org.junit.Test;
//
// import
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.dao.DaoBase;
// import
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.dao.implementation.DaoStoreBaseCollection;
// import
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
// import
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
// import
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
// import
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
// import
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
// import
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao.NotAddElementBaseException;
// import
// com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.calculator.implemenatation.CalculatorCollectionTest;
//
// public class SumArrayTest {
// private DaoBase dao;
// private Base storeBase;
//
// private CalculatorCollectionTest sum;
// private Device d2;
// private Device d1;
// private Device d3;
//
// @Before
// public void BeforeTest() {
// dao = new DaoStoreBaseCollection(new Base<Device>());
//
// sum = new CalculatorCollectionTest();
// d1 = new MobilePhone(1, DeviceType.MOBILE_PHONE, "Xiaomi", "Redmi 6A",
// "Black", new BigDecimal(250.50), 5, 5.45,
// "MediaTek Helio A22", 2, 3000, "4G");
//
// d2 = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29",
// "While", new BigDecimal(1440.50),
// 5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");
//
// d3 = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new
// BigDecimal(556.0), 31, 15.6,
// "Intel Celeron N4000", 8, 7000, 500);
//
// try {
// dao.add(d1);
// dao.add(d2);
// dao.add(d3);
// } catch (NotAddElementBaseException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
//
// @Test
// public void sumPriceTest() {
// BigDecimal temp = new BigDecimal("0");
//
// temp = temp.add(d1.getPrice()).add(d2.getPrice()).add(d3.getPrice());
//
// assertEquals(temp, sum.sumPrice(dao));
//
// }
//
// }
