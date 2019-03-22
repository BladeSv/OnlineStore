package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.basedecatator;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getFileName;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.io.ObjectSerializationBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection.Collection;

public class BaseSerialization<T> extends BaseDecarator<T> {
	private boolean check = false;
	String fileName = getFileName();

	public BaseSerialization(Base base) {
		super(base);

	}

	@Override
	public boolean add(T t) {
		check = base.add(t);
		ObjectSerializationBase.write(base, fileName);

		return check;
	}

	@Override
	public boolean set(int index, T t) throws IndexOutOfRangeException {
		check = base.set(index, t);
		ObjectSerializationBase.write(base, fileName);

		return check;
	}

	@Override
	public boolean remove(T t) throws NotInCollectionException {
		check = base.remove(t);
		ObjectSerializationBase.write(base, fileName);

		return check;
	}

	@Override
	public T get(int index) throws IndexOutOfRangeException {

		return (T) ObjectSerializationBase.read(fileName).get(index);
	}

	@Override
	public Collection<T> getBase() {

		return ObjectSerializationBase.read(fileName).getBase();
	}

}
