import java.util.Scanner;
// EVEN check function
public class Even {
    static void checkeven(int n){
      if(n%2==0)
      {
        System.out.println("Even");
      }
      else{
        System.out.println("Odd");
      }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        checkeven(num);
        sc.close();
    }
}