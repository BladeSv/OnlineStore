package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.basedecatator;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getFileName;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.io.ObjectSerializationBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.base.WrongSetBaseExeption;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection.Collection;

public class BaseSerialization<T> extends BaseDecarator<T> {
	private boolean check = false;
	private static String fileName = getFileName();

	public BaseSerialization() {
		super(ObjectSerializationBase.read(fileName));

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

	@Override
	public void setBase(Collection<T> base) throws WrongSetBaseExeption {
		this.base.setBase(base);
		ObjectSerializationBase.write(this.base, fileName);

	}

	@Override
	public Object[] toArray() {

		return base.toArray();
	}

	@Override
	public String toString() {

		return base.toString();
	}

}
