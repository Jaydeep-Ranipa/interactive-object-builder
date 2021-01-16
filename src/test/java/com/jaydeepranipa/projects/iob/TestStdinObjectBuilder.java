package com.jaydeepranipa.projects.iob;

import com.jaydeepranipa.projects.iob.FieldValueScanner;
import com.jaydeepranipa.projects.iob.ObjectBuilder;
import com.jaydeepranipa.projects.iob.StdinObjectBuilder;

import junit.framework.TestCase;

class Mobile {

	private String name;
	private int price;

	public Mobile(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + "]";
	}
}

public class TestStdinObjectBuilder extends TestCase {
	
	private static ObjectBuilder objectBuilder;
	
	protected void setUp() throws Exception {
		objectBuilder = new StdinObjectBuilder(new FieldValueScanner(System.in));
	}
	
	protected void tearDown() throws Exception {
	}

	public void testBuildMobileObject() throws Exception {
		Mobile mobile = (Mobile) objectBuilder.build(Mobile.class);
		
		System.out.println(mobile);
	}
	
}
