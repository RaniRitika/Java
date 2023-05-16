import java.util.Scanner;

public class Vote {
    public static void main(String[] args){
     int Candidate[]={0,0,0,0}; 
     int nota=0;
     
     Scanner sc = new Scanner(System.in);
     System.out.println("\t\t\tWELCOME HERE!!!\n Please Enter the number of voter");
     int voter=sc.nextInt();
     for(int i=0;i<voter;i++){
     System.out.println("This is Voting Machine\n\n\n PLEASE GIVE VOTE TO YOUR CANDIDATE ON THEIR RESPECTIVE SYMBOL");
     System.out.println("1. CYCLE\n2. PHONE\n3. WATCH\n4. BOOK\n5. NOTA ");
     int ch= sc.nextInt();
     switch(ch){
        case 1: 
               Candidate[0]+=1;
               break;
        case 2:
              Candidate[1]++;
               break;
        case 3:
               Candidate[2]++;
               break;
        case 4:
              Candidate[3]++;
              break;
        case 5:
            nota++;

     }}
     System.out.println("-----THE VOTING IS COMPLETE-----");
     System.out.println("\nSELECT YOUR CHOICE---\n1. WINNER CANDIDATE\n2. EXIT");
     int ch=sc.nextInt();
     switch(ch){
        case 1:
        System.out.println("Maximum vote is: "+getMaxVote(Candidate)+" and WINNER is the Candidate Number "+getWinner(getMaxVote(Candidate), Candidate));
        break;
        case 2:
        System.exit(0);
        // System.out.println("Maximum vote is: "+getLeastVote(Candidate)+" and WINNER is the Candidate Number "+getLosser(getLeastVote(Candidate), Candidate));
     }
    
    }
    public static int getMaxVote(int []arr){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest)
               largest=arr[i];
            // else
            // largest= arr[i+1];
        }
        return largest;
    }
    public static int getWinner(int n,int []arr){
      for(int i=0;i<arr.length;i++){
       if(n==arr[i])
       return i+1;
      }
      return -1;
    }
    // public static int getLeastVote(int arr[]){
    //     int least=Integer.MAX_VALUE;
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]<least)
    //         least=arr[i];
    //     }
    //     return least;
    // }
    // public static int getLosser(int n,int []arr){
    //     for(int i=0;i<arr.length;i++){
    //      if(n==arr[i])
    //      return i+1;
    //     }
    //     return -1;
    //   }
}
