package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

/**
 * @author Mitrahovich
 *
 */
public interface Copyable<T extends Device> {
	T copy();
}
