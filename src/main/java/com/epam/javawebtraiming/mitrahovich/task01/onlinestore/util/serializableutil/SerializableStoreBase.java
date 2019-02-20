package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.serializableutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public class SerializableStoreBase {

	public SerializableStoreBase() {
		// TODO Auto-generated constructor stub
	}

	private static File file = new File("src\\main\\resources\\serializablebase\\serialstorebase.out");

	public static StoreBase inputStoreBase() {

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
			return null;
		}

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

			return (StoreBase) in.readObject();

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
		return null;

	}

	public static void outputStoreBase(StoreBase storeBase) {

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file))) {

			os.writeObject(storeBase);
			os.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
