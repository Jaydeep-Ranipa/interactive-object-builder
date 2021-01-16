package com.jaydeepranipa.projects.iob;

/**
 * The interface {@link ObjectBuilder} represents classes that can build an
 * object of any POJO class using various input methods. Example: stdin, file
 * etc.
 * 
 * @author JRanipa
 * @version
 */
public interface ObjectBuilder {

	public Object build(Class<?> clazz) throws Exception;
}
