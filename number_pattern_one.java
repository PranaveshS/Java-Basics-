import java.util.Scanner;
class number_pattern_one
{
	public static void main(String args[])
	{
		int n,i,j,k;
		Scanner scn=new Scanner(System.in);
				System.out.print("Enter the limit: ");
		n=scn.nextInt();
		k=n;
		for (i=0;i<=n;i++){
			for (j=1;j<=n-i;j++){
				System.out.print(k);
			}
			k--;
			System.out.print("\n");
		}
	}
}