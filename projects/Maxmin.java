import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        int max=num[0];
        for(int i=1;i<size;i++)
        {
           if(num[i]>max)
           max=num[i];
        
        }
        sc.close();
        System.out.println(max);
        
    }
}
