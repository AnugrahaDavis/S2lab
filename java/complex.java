import java.util.Scanner;
public class complex {
    public static void main(String[] arg){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part of 1st number");
        int x=sc.nextInt();
        System.out.println("Enter imaginary part of 1st number");
        int y=sc.nextInt();
         System.out.println("Enter real part of 2nd number");
        int a=sc.nextInt();
        System.out.println("Enter imaginary part of 2nd number");
        int b=sc.nextInt();

        int real=x+a;
        int img=y+b;
        System.out.println(real+" + i"+img);

    }
}
