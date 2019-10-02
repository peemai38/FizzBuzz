package TDD;

import java.util.Scanner;

public class FizzBuss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		System.out.println(input);
		String output = getinput(input);
	}
	
	public static String getinput(int i) {
		if(i%3==0) {
			return "Fizz";
		}
		else{
			return Integer.toString(i);
		}
	}

}
