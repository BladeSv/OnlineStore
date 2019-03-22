package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.io;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getInputTextFileName;
import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getOutputTextFileName;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;

public class ObjectSerializationBase {
	private static final Logger log = Logger.getRootLogger();
	private static String inputTexFileName = getInputTextFileName();
	private static String outpuStringtTexFileName = getOutputTextFileName();

	public ObjectSerializationBase() {

	}

	public static void write(Base base, String fileName) {

		try (ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(outpuStringtTexFileName + fileName)))) {

			os.writeObject(base);
			os.flush();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			log.warn("Cant write serialization base", e);
			e.printStackTrace();
		}

	}

	public static Base read(String fileName) {
		Base base = null;
		try (ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(new FileInputStream(inputTexFileName + fileName)))) {

			base = (Base) (is.readObject());

		} catch (FileNotFoundException e) {
			log.warn("doesnt find file for read serialization base", e);
			e.printStackTrace();
		} catch (IOException e) {
			log.warn("cant read serialization base", e);
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			log.warn("cant convert serialization base", e);
			e.printStackTrace();
		}
		return base;
	}

}
