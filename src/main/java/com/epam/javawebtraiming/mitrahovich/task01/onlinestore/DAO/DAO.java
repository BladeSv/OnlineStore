package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO;

import java.util.List;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;

public interface DAO {
	void add(Device device);

	void removeById(int id);

	Device getById(int id);

	List<Device> getAll();

}
