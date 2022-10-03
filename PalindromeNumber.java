
import java.util.Scanner;
class PalindromeNumber {
	
	//method to reverse a number
	static int reverseNumber(int number) {
		int reversednumber=0;
		while(number>0) {
			reversednumber=reversednumber *10 +number%10;
			number=number/10;
		}
		return reversednumber;
	}

	public static void main(String[] args) {
		int number;
		System.out.println("enter a number :");
		
		//takes input from the user
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		
		//check & return given number and reversed number is same or not
		int reverseN=reverseNumber(number);
		System.out.println("Reversed number="+reverseN);
		if(number==reverseN)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");

		

	}

}

