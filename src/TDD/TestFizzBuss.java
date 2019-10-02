package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestFizzBuss {
	FizzBuss fizzbuss = new FizzBuss();
	int input = fizzbuss.getinput(1);	
	
	@Test
	@DisplayName("input 1 : expect 1")
	void TC01() {	
		assertEquals(1, input);
	}
}
