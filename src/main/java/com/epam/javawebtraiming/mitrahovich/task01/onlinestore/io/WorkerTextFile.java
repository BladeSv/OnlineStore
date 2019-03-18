package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkerTextFile {

	public WorkerTextFile() {

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

	public static String read(String fileName) {

		StringBuilder sb = null;
		try (DataInputStream is = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
			sb = new StringBuilder();
			while (is.readBoolean()) {
				sb.append(is.readUTF());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sb.toString();
	}

}
