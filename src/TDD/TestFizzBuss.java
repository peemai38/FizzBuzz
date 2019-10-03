package TDD;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestFizzBuss {
	FizzBuss fizzbuss = new FizzBuss();
	String input = fizzbuss.getinput(1);
	String input2 = fizzbuss.getinput(2);
	String input3 = fizzbuss.getinput(3);
	String input4 = fizzbuss.getinput(4);
	
	@Test
	@DisplayName("input 1 : expect 1")
	void TC01() {	
		assertEquals("1", input);
	}
	
	@Test
	@DisplayName("input 2 : expect 2")
	void TC02() {	
		assertEquals("2", input2);
	}
	
	@Test
	@DisplayName("input 3 : expect Fizz")
	void TC03() {	
		assertEquals("Fizz", input3);
	}
	
	@Test
	@DisplayName("input 4 : expect 4")
	void TC04() {	
		assertEquals("4", input4);
	}
}
