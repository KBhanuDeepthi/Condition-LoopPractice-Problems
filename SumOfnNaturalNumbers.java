import java.util.Scanner;
class SumOfnNaturalNumbers {

		public static void main(String[] args) {
			int sum=0;
			System.out.println("Enter the number:");
			
			//take input from the user using scanner
			Scanner scanner=new Scanner(System.in);
			int num=scanner.nextInt();
			//executes until the condition returns true
			for(int firstinput=1;firstinput<=num;++firstinput) 
			{
				//adding the value of firstinput into sum
				sum=sum+firstinput;
			}
			
			//prints the sum
	        System.out.println("Sum of numbers :"+sum);
		}

}
