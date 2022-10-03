import java.util.Scanner;
public class VowelOrConsonantUsingSwitch {

		public static void main(String[] args) {
			boolean isVowel=false;
			System.out.println("Enter a Character");
			
			//takes input from the user
			Scanner scanner=new Scanner(System.in);
			char character=scanner.next().charAt(0);
			
			//checks the cases &return the result
			switch(character) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':isVowel=true;
			}
			if(isVowel==true) {
				System.out.println(character+ " is a vowel");
			}
		    else {
		    	if((character>='a' && character<='z') || (character>='A' && character<='Z'))
		    	System.out.println(character+ " is a consonant");
		    	else
		    		System.out.println("It is not an alphabet");
					
			}
			}

}
