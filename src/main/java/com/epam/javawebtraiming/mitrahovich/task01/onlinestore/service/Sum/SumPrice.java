package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.service.Sum;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.order.Order;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.storebase.StoreBase;

public class SumPrice {
public static double sumPrice( Order order) {
	return Arrays.stream(order.getOrder()).mapToDouble((d)->d.getPrice()).sum();
	
	
}

public static double sumPrice(StoreBase storeBase) {
	double sum=0;
	int i=0;
	while(storeBase.getDeviceBase()[i]!=null){
		sum=+storeBase.getDeviceBase()[i].getPrice();
		
		i++;
	}
	
	return sum;
}
}
