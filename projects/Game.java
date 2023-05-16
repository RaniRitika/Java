import java.util.Random;
import java.util.Scanner;


public class Game {
    // Method for camparison between user and computer choice
  public static int rockpaperscissor(char you,char comp)
{
   // UNDRAW CONDITIONS
    if(you=='p'&& comp=='r')       
     return 1;
     else if(you=='r'&& comp=='p')
     return -1;
     else if(you=='r'&& comp=='s')
     return 1;
     else if(you=='s' && comp=='r')
     return -1;
     else if(you=='p' && comp=='s')
     return -1;
     else if (you=='s'&&comp=='p')
     return 1;
     // DRAW CONDITIONS 
     else 
     return 0;
    }
   
 public static void main(String[] args) {
    char you,com;
    // CREATING RANDOM OBJECT
    Random rand= new Random();
   //GENERATING RANDOM NUMBER
    int number = rand.nextInt(100);
    //ASSIGNING NUMBER TO CHOICE
    if(number<33){
        com='p';
    }
    else if(number>33&&number<66)
    {
        com='r';
    }
    else{com='s';
 }
 // CREATING SCANNER OBJECT
 Scanner sc= new Scanner(System.in);
   System.out.println("Enter your choice : \n For Paper  -> p\n For Scissor  -> s\n For Rock  -> r");
   //TAKING INPUT FROM USER
   you= sc.next().charAt(0);
   //CALLING METHOD 
   int result=rockpaperscissor(you,com);
   //CAMPARING AND DISPLAYING RESULT
    if(result==0){
       System.out.println(" GAME DRAW!");
    }
    else if(result==1)
    {
       System.out.println("YOU WIN !!!");

    }
    else{
        System.out.println("YOU LOSE!!!");
    }
    //DISPLAY CHOICES
    System.out.println(" You choose "+you+" Computer choose "+com);
 }
}