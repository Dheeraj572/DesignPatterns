package com.java.designpatterns;

public class SingletonPattern {

	private static volatile SingletonPattern singleton;

	private SingletonPattern() {
		if (singleton != null) { 		// Ensuring to throw error when someone tries to alter the state os the constructor using Reflection
			throw new RuntimeException("Create instance using getInstance method");
		}
	}

	public static SingletonPattern getInstance() {

		if (singleton == null) { 					// Double Checking
			synchronized (SingletonPattern.class) {		// Making Thread safe
				if (singleton == null) {
					singleton = new SingletonPattern();
				}

			}

		}
		return singleton;
	}
}
