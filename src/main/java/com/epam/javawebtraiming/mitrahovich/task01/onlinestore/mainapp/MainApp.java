package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.mainapp;

import java.util.ArrayList;
import java.util.List;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyIndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.arraycollection.MyArrayQueue;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.IMyCollection;

public class MainApp {

	public static void main(String[] args) throws MyIndexOutOfRangeException {
		// MainController controller = new MainController();
		// controller.run();
		IMyCollection<String> col = new MyArrayQueue<>(0);
		List<String> lis = new ArrayList<>();

		lis.add("sd");
		lis.add(null);
		col.add("first");
		col.add("second");
		col.add("third");

		col.add(null);
		col.add("foor");
		lis.add("firstasds");
		lis.add("sdsdsdds");
		// String z = col.get(0);

		String z = lis.get(3);
		System.out.println(z);
		// for (String s : col)
		// System.out.println(s);
		System.out.println();
		// for (String s : lis)
		// System.out.println(s);
	}

}
