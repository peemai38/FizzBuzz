package TDD;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestFizzBuss {
	FizzBuss fizzbuss = new FizzBuss();
	int input = fizzbuss.getinput(1);
	int input2 = fizzbuss.getinput(2);
	
	@Test
	@DisplayName("input 1 : expect 1")
	void TC01() {	
		assertEquals(1, input);
	}
	
	@Test
	@DisplayName("input 2 : expect 2")
	void TC02() {	
		assertEquals(2, input2);
	}
}
