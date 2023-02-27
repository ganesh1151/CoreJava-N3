package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationsDemo {

	@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() {
		System.out.println("First Junit test case");
	}
	
	@Test
	@BeforeAll
	/* if we make this method as static then we will not get
	 * method name in testing
	 * to overcome this we must have to use @TestInstance(Lifecycle.PER_CLASS)
	 */
	static void display() {
		System.out.println("Welcome to Junit testing");
	}
	
	@Test
	@disabled
	@AfterEach
	void accept() {
		System.out.println("After Each Method");
	}

}
