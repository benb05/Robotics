import java.util.*;

public class UI {
    
    private static void cardReader(){
        System.out.println("Please play a card");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        if(str == "King"){
            System.out.println("Placing" + str);
        }
        else{
            System.out.println("ERROR: INVALID CARD");
        }

       }
    





    public static void main(String[] args) {
    
        cardReader();

    

    }
}
