package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings="Ganesh")
	void test() {
		System.out.println("Hello");
	}
	
	@ParameterizedTest
	@ValueSource(strings={"Ganesh","Shubham"})
	void display(String str) {
		assertNotNull(str);
	}
}
