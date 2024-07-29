import java.util.Scanner;
public class vote {
    public static Scanner sc=new Scanner(System.in);
        public static void main(String[] args){
            System.out.print("Enter the age:");
            int a=sc.nextInt();
            if(a>=18)
            {
                System.out.print("You are eligible to VOTE");
            }
            else{
                System.out.print("You are not eligible to VOTE");
            }
        }
    
}
