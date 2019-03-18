package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkerBinFile {

	public WorkerBinFile() {

	}

	public static void write(String string, String fileName) {

		try (DataOutputStream os = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
