package com.java.designpatterns;

import com.java.designpatterns.BuilderPattern.Builder;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton Pattern
		SingletonPattern singleton1 = SingletonPattern.getInstance();
		System.out.println(singleton1);
		SingletonPattern singleton2 = SingletonPattern.getInstance();
		System.out.println(singleton2);
		SingletonPattern singleton3 = SingletonPattern.getInstance();
		System.out.println(singleton3);
		
		//Builder Pattern
		BuilderPattern.Builder builder = new Builder();
		
		BuilderPattern builderPattern = builder.company("Company").designation("Designation").salary(10).name("Name").build();
		
		System.out.println(builderPattern.toString());
		
	}

}
