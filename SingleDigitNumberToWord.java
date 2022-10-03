
import java.util.Scanner;

class SingleDigitNumberToWord {
    
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number:");
		
		// takes input from the user 
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		
		//check conditions & return the value  
		if(num==1)
			System.out.println("One");
		else if(num==2)
			System.out.println("Two");
		else if(num==3)
			System.out.println("Three");
		else if(num==3)
			System.out.println("Four");
		else if(num==3)
			System.out.println("Five");
		else if(num==3)
			System.out.println("Six");
		else if(num==3)
			System.out.println("Seven");
		else if(num==3)
			System.out.println("Eight");
		else if(num==3)
			System.out.println("Nine");
		else if(num==10)
			System.out.println("Ten");
		else
			System.out.println("Invalid Number");
	}

}
