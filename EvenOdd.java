package day10;

public class EvenOdd {
	public static void main(String[] args) {
		int num = 9;
		
		
		if (num % 2 == 0) {
			System.out.println(num + " is even.");
		}	else {
			System.out.println(num + " is odd.");
		}
		
		evenOrOdd(7);
		evenOrOdd(10);
		
	}


	public static void evenOrOdd(int number) {		
		if (number % 2 == 0) {
		System.out.println(number + " is even");
	}	else {
		System.out.println(number + " is odd");
	}
	
}
}