import java.util.Scanner;

class number_pattern
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner scn=new Scanner(System.in);

		System.out.print("Enter the limit: ");
		n=scn.nextInt();
	for(i=n;i>0;i--){
        for(j=i;j>0;j--){
            System.out.print(j);
        }
        System.out.println();
    }
	}
}
