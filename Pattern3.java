import java.util.Scanner;
public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of star do you want to print:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int k=num-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        }

}

    

