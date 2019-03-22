package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.calculator.implemenatation;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.calculator.Calculator;

public class CalculatorCollection<T extends Device> implements Calculator<T> {
	private static final Logger log = Logger.getRootLogger();

	@Override
	public BigDecimal sumPrice(DaoBase<T> base) {
		BigDecimal sum = new BigDecimal("0");
		Base<T> tempBase = base.getAll();
		for (T dev : tempBase.getBase()) {
			if (dev != null) {
				sum = sum.add(dev.getPrice());
				log.trace("device-" + dev.getClass().getSimpleName() + " ,price: " + dev.getPrice());
			}
		}
		log.trace("sum: " + sum);
		return sum;

	}
}
