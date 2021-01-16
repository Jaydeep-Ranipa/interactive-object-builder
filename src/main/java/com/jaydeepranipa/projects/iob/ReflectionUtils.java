package com.jaydeepranipa.projects.iob;

import java.lang.reflect.Constructor;

public class ReflectionUtils {
	
	public static Constructor<?> getAllArgumentConstructor(Class<?> clazz) throws Exception {
		int fieldCount = clazz.getDeclaredFields().length;
		for (Constructor<?> constructor : clazz.getConstructors()) {
			if (fieldCount == constructor.getParameterCount()) {
				return constructor;
			}
		}
		throw new Exception("The class " + clazz.getCanonicalName() + " does not contain all arguments constructor.");
	}
}
