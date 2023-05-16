import java.util.Scanner;
//input string in array
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String []strarr=new String[size];
        for(int i=0;i<size;i++)
        {
            strarr[i]=sc.next();
        }
        System.out.println("The  names are :");
        for(int i=0;i<size;i++)
        {
            System.out.println(strarr[i]);
        }
        sc.close();
    }
}
