package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.service.Sum;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.order.Order;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.storebase.StoreBase;

public class SumPrice {
public static double sumPrice( Order order) {
	return Arrays.stream(order.getOrder()).mapToDouble((d)->d.getPrice()).sum();
	
	
}

public static double sumPrice(StoreBase storeBase) {
	return Arrays.stream(storeBase.getDeviceBase()).mapToDouble((d)->d.getPrice()).sum();
	
	
}
}
