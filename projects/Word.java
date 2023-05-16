    //Find the word count of paragraph
import java.util.*;


public class Word{
    static int numWordcount=0;
    //method for counting word
    static int word_count(String para,int count){
        for(int i=0;i<para.length()-1;i++){
            if(para.charAt(i)==' '){
              count++;
            }
        }
        // return the word count and add the last word in count variable
        return count+1;
    }
    static int numWord(int i,String s,String sear){
        //base case
        if(s.length()<sear.length())
          return numWordcount;
        int n=s.indexOf(sear, i);
        if(n!=-1)
       { numWordcount++;
        //numWord(n+sear.length(), s.substring(n+sear.length()),sear);
        numWord(0, s.substring(n+sear.length()),sear);
       }
    
       return numWordcount;
    }

   
    public static void main(String[] args) {
        System.out.println("This is a NoteBook. Please write your notes a find number of words");
        System.out.println("Starts Writing:---");
        Scanner sc= new Scanner(System.in);
        // Declare the String variable
        String paragraph=new String();
        //Take input in paragraph
        paragraph=sc.nextLine();
        //Declare counter variables
        int count,word_count=0;
        //Call method for count the word
        count =  word_count(paragraph, word_count);
        //Display the counting of word
        System.out.println("\nThe number of character is: "+paragraph.length()+"\n The number of word is : "+count);
       // System.out.println(paragraph.indexOf("the"));
       System.out.println(numWord(0, paragraph,"the"));
        sc.close();
        
    }
}