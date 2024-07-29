import java.util.Scanner;
public class right_tri_num {
    public static void main(String[] args){
        int k=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
