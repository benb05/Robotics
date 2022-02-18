import java.util.ArrayList;


public class arrayList {
    ArrayList <Integer> deck = new ArrayList <Integer> ();
    
    private ArrayList <Integer> arrayPopulator(int size){
        for (int i = 0; i < size; i++){
            deck.add((int)(Math.random()* 100));


        }
        return deck;
    }

   private void showArray(){
       arrayPopulator(10);
    for (int k = 0; k < deck.size(); k ++){
            System.out.println(deck.get(k));
       }

   } 


   public static void main(String[] args) {
       new arrayList().showArray();
   }
}