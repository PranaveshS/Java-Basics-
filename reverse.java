/*import java.util.Scanner;
public class reverse {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int x,y,rev=0;
        System.out.print("Enter the integer:");
        x=sc.nextInt();
        while(x>0){
            y=x%10;
            rev=rev*10 +y;
            x=x/10;
        }
        System.out.println(rev);
    }
}*/
import java.util.Scanner;
class reverse {
    public static Scanner sc=new Scanner(System.in);
public static void main(String[] args)
{
    int i;
    String c="";
    System.out.print("Enter the String: ");
    String a=sc.nextLine();
    for(i=a.length()-1;i>=0;i--)
    {
        String b=c+a.charAt(i);
        System.out.print(b);
    }
}
}
