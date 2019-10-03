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
	String input5 = fizzbuss.getinput(5);
	String input6 = fizzbuss.getinput(6);
	String input7 = fizzbuss.getinput(7);
	String input8 = fizzbuss.getinput(8);
	String input9 = fizzbuss.getinput(9);
	
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
	
	@Test
	@DisplayName("input 5 : expect Buzz")
	void TC05() {	
		assertEquals("Buzz", input5);
	}
	
	@Test
	@DisplayName("input 6 : expect Fizz")
	void TC06() {	
		assertEquals("Fizz", input6);
	}
	
	@Test
	@DisplayName("input 7 : expect 7")
	void TC07() {	
		assertEquals("7", input7);
	}
	
	@Test
	@DisplayName("input 8 : expect 8")
	void TC08() {	
		assertEquals("8", input8);
	}
	
	@Test
	@DisplayName("input 9 : expect Fizz")
	void TC09() {	
		assertEquals("Fizz", input9);
	}
}
