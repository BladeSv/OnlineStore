package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO;



import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;

public interface IDaoStoreBase {
	void add(Device device);

	void removeById(int id);

	Device getById(int id);

	Device[] getAll();

}
