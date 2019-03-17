package com.greeting;

public class Greeting {

	public String greet(String... name) {
		String nameBuilder = new String("Hello");
		if (name.length > 0) {
			for (int i = 0; i < name.length; i++) {
				if (i == (name.length - 1) && (name.length > 1)) {
					if ((name.length > 2)) {
						nameBuilder += ", and " + name[i] + ".";
					} else {
						nameBuilder += " and " + name[i] + ".";
					}
				} else if (name.length == 1) {
					if (name[i].equals(name[i].toUpperCase())) {
						nameBuilder = "HELLO " + name[i] + "!";
					} else {
						nameBuilder += ", " + name[i] + ".";
					}
				} else {
					nameBuilder += ", " + name[i];
				}
			}
		} else {
			return nameBuilder + ", my friend.";
		}

		return nameBuilder;
	}

}
