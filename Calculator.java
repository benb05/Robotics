import java.util.*;

public class Calculator {

    
    private static void Caller(){
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        
        if (input.equals("add")){
            Addition();
        }

        else {
            System.out.println("ERROR: FUNCTION NOT FOUND.");
        }

    }


  
      private static void Addition(){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        
    }
        
    
    
    public static void main(String[] args) {
        Caller();
    }
}
