package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuss {

	@Test
	@DisplayName("input 1 : expect 1")
	void TC01() {	
		int input =0;
		assertEquals(1, input);
	}

}
