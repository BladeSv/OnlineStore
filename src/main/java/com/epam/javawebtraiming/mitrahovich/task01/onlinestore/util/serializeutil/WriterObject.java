package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.serializeutil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//new FileOutputStream(file)
public class WriterObject {

	public void inicialize() {
		try {
			File file = new File("/resources/serializablebase/storebasearray.txt");
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ObjectOutputStream op = new ObjectOutputStream() {

				@Override
				public void write(int b) throws IOException {
					// TODO Auto-generated method stub

				}
			};
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
