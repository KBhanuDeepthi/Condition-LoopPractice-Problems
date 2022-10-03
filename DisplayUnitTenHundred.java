import java.util.Scanner;
class DisplayUnitTenHundred {

		public static void main(String[] args) {
			int num;
			System.out.println("Enter the number");
			
			//takes input from the user
			Scanner scanner=new Scanner(System.in);
			num=scanner.nextInt();
			
			//check condition & return the value
			if(num==1)
				System.out.println("Unit");
			else if(num==10)
				System.out.println("Ten");
			else if(num==100)
				System.out.println("Hundred");
			else if(num==1000)
				System.out.println("Thousand");
			else if(num==10000)
				System.out.println("Ten thousand");
			else
				System.out.println("Invalid Number");


		}


}
