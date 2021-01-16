package com.jaydeepranipa.projects.iob;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

public class FieldValueScanner {

	private String prefix;
	private String suffix;

	private Scanner scanner;

	public FieldValueScanner(InputStream stream) {
		this.prefix = "";
		this.suffix = "";
		this.scanner = new Scanner(stream);
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Object scan(Field field) {

		System.out.print(getPrompt(field.getName()));

		String type = field.getType().getName();

		switch (type) {
		case "java.lang.String":
			return inputString();

		case "int":
			return inputInt();

		//TODO: Add cases for other types
			
		default:
			// TODO: This is a case where the class member is an object of another class. So call ObjectBuilder for that another class.
			return null;
		}
	}

	private String getPrompt(String name) {
		return this.prefix + name + this.suffix + ": ";
	}

	private Object inputInt() {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}

	private Object inputString() {
		String value = scanner.nextLine();
		return value;
	}

}
