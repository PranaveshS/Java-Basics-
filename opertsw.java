import java.util.Scanner;

class opertsw
{
    public static void main (String args[])
    {
        char c ='Y';
        Scanner sc=new Scanner(System.in);
        int a, b;
        System.out.println(" 1.Addition \n 2.Subtraction\n 3.Multiplication\n 4.Division \n 5.Modulus \n 6.Exit ");
        c=sc.next().charAt(0);
        switch(c)
        {
            case '1':
                System.out.println("Enter the Numbers");
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("Addition is :"+(a+b));
                break;
            case '2':
                System.out.println("Enter the Numbers");
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("Subraction is :"+(a-b));
                break;
            case '3':
                System.out.println("Enter the Numbers");
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("Multiplication is :"+(a*b));
                break;
            case '4':
                System.out.println("Enter the Numbers");
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("Division is :"+(a/b));
                break;
            case '5':
                System.out.println("Enter the Numbers");
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("Modulus is :"+(a%b));
                break;
            case '6':
                break;
            default:
                System.out.println("Please Enter The Correct option");

        }
    }
}