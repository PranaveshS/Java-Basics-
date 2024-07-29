import java.util.Scanner;
public class twotable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int i=0;
        for(i=1;i<=n;i++)
        {
            int a=i*2;
            System.out.println(a);
        }
    }
}
