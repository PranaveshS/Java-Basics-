import java.util.Scanner;
public class ntable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the value to be displayed:");
        int table=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            int b=i*table;
            System.out.println(b);
        }
    }
}
