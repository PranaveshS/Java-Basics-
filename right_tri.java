import java.util.Scanner;
public class right_tri {
	public static void main(String args[])
	{
		int n,i,j,sp;
		Scanner scn=new Scanner(System.in);

		System.out.print("Enter the range:");
		n=scn.nextInt();
		for (i=0;i<n;i++)
		{
			for (sp=1;sp<n-i;sp++)
			{
				System.out.print(" ");
			}
			for (j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}