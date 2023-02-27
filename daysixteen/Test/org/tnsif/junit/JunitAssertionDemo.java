package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//program to demonstrate on assertion annotations
class JunitAssertionDemo {

	@Test
	void test() {
		assertEquals(12,12);
	}
	
	
	//assertFalse execute when expression is not false( means true)
	@Test
	void display() {
		assertFalse(12==11);
	}

}
