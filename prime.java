import java.util.Scanner;
public class prime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        if(a/2==1)
        {
            System.out.print("It is a Prime Number");
        }
        else
        {
            System.out.print("It is Not a Prime Number");
        }
    }
}
