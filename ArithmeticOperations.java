import java.util.Scanner;
class ArithmeticOperations {

		public static void main(String[] args) {
			
			//takes input values(a,b,c) from the user
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the value of a :");
			int a=scanner.nextInt();
			System.out.println("Enter the value of b :");
			int b=scanner.nextInt();
			System.out.println("Enter the value of c :");
			int c=scanner.nextInt();
			
			//perform arithmetic operations 
			int number1=a+b*c;
			int number2=c+a/b;
			int number3=a%b+c;
			int number4=a*b+c;
			
			//check conditions & return Maximum value
			if(number1>number2 && number1>number3 && number1>number4) {
				System.out.println("Maximum num is :" +number1);
			}
			else if(number2>number1 && number2>number3 && number2>number4) {
				System.out.println("Maximum num is :" +number2);
			}
			else if(number3>number1 && number3>number2 && number3>number4) { 
				System.out.println("Maximum num is:"+number3);
			}
			else
				System.out.println("Maximum num is :"+number4);
			
			//check conditions & return minimum value
			if(number1<number2 && number1<number3 && number1<number4) {
				System.out.println("Minimum num is :" +number1);
			}
			else if(number2<number1 && number2<number3 && number2<number4) {
				System.out.println("Minimum num is :" +number2);
			}
			else if(number3<number1 && number3<number2 && number3<number4) { 
				System.out.println("Minimum num is:"+number3);
			}
			else
				System.out.println("Minimum num is :"+number4);
		}

}
