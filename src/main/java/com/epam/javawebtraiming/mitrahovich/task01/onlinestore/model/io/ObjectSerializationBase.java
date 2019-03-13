package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;

public class ObjectSerializationBase {

	public ObjectSerializationBase() {

	}

	public static void write(Base base, String fileName) {

		try (ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {

			os.writeObject(base);
			os.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Base reade(String fileName) {
		Base base = null;
		try (ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {

			base = (Base) (is.readObject());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return base;
	}

}
