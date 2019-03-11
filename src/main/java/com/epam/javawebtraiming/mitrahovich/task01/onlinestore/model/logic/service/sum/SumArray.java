package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sum;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;

public class SumArray<T extends Device> implements ISum<T> {

	@Override
	public BigDecimal sumPrice(IDaoBase<T> base) {
		BigDecimal sum = new BigDecimal("0");
		Base<T> tempBase = base.getAll();
		for (T dev : tempBase.getDeviceBase()) {
			if (dev != null) {
				sum = sum.add(dev.getPrice());
			}
		}

		return sum;
	}
}
