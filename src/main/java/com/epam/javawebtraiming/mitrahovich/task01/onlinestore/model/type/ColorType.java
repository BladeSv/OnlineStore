package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.type;

public enum ColorType {

	White("White"), Black("Black"), Blue("Blue"), Red("Red"), Yellow("Yellow");
	
	private String type;

	private ColorType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	
}
