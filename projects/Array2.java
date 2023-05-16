public class Array2 {
    public static int Linearsrch(String[] S,String key){
        
        for( int i=0;i<S.length;i++){
             if(key==S[i]){
                return i;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] dish={"samosa","chai","fish","roti"};
        String key="sabji";
    System.out.println("the index is "+Linearsrch(dish, key));

    }
}
