import java.util.Scanner;

class vowels
{
	public static void main(String args[])
	{
		char a;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a character :");
		a=sc.next().charAt(0);

		switch(a)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("It is a vowel");
				break;
			default:
				System.out.println("It is a consonant");
				break;
		}
	}
}
