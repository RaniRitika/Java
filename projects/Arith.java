import java.util.Scanner;
public class Arith{
    public static void main(String []args){
        System.out.println("Enter two number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=sc.nextFloat();
        float sum=a+b;
        System.out.println("a="+a+" b="+b+" a+b="+sum);
        sc.close();
    }
}