package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.io;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getInputTextFileName;
import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getOutputTextFileName;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

public class WorkerTextFile {
	private static final Logger log = Logger.getRootLogger();
	private static String inputTexFileName = getInputTextFileName();
	private static String outpuStringtTexFileName = getOutputTextFileName();

	public WorkerTextFile() {

	}

	public static void write(String string, String fileName) {
		try (BufferedWriter os = new BufferedWriter(new FileWriter(inputTexFileName + fileName))) {

		} catch (FileNotFoundException e) {
			log.warn("doesnt find file for write text", e);
			e.printStackTrace();
		} catch (IOException e) {
			log.warn("cant write text", e);
			e.printStackTrace();
		}

	}

	public static String read(String fileName) {

		StringBuilder sb = null;
		try (BufferedReader is = new BufferedReader(new FileReader(outpuStringtTexFileName + fileName))) {
			sb = new StringBuilder();
			while (is.ready()) {
				sb.append(is.readLine()).append("\n");
			}

		} catch (FileNotFoundException e) {
			log.warn("doesnt find file for read text", e);
			e.printStackTrace();
		} catch (IOException e) {
			log.warn("cant read text", e);
			e.printStackTrace();
		}

		return sb.toString();
	}

}
