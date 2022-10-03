import java.util.Scanner;
class ReverseNumber {

		public static void main(String[] args) {
			int number;
			System.out.println("Enter the number");
			
			//takes input from the user
			Scanner scanner=new Scanner(System.in);
			number=scanner.nextInt();
			int reverse=0;
			int remainder;
			
			//condition to reverse a number
			while(number!=0) {
				remainder=number % 10;
				reverse =(reverse*10)+remainder;
				number=number/10;
			}
			
			//print the reversed number
			System.out.println("Reversed Number is " +reverse);

		}

}
