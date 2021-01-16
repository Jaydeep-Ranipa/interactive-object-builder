package com.jaydeepranipa.projects.iob;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class StdinObjectBuilder implements ObjectBuilder {

	private FieldValueScanner fieldValueScanner;

	public StdinObjectBuilder(FieldValueScanner fieldValueScanner) {
		this.fieldValueScanner = fieldValueScanner;
	}

	@Override
	public Object build(Class<?> clazz) throws Exception {
		Field[] declaredFields = clazz.getDeclaredFields();
		List<Object> fieldValues = new ArrayList<Object>();

		for (Field field : declaredFields) {
			fieldValues.add(fieldValueScanner.scan(field));
		}

		return ReflectionUtils.getAllArgumentConstructor(clazz).newInstance(fieldValues.toArray());
	}

}
