public class averageFinder {
    //purpose of class is to find the average of an array

    private static int[] arrayPopulator(){
        int[] targetArray;

        targetArray = new int [10];

        for(int i = 0; i <= targetArray.length; i++){
            
            targetArray[i] = (int)Math.random();


        }
        for(int i = 0; i < targetArray.length - 1; i++){
            System.out.println(targetArray[i]);
        }
       return targetArray;
        }

        
    
        
 public static void main(String[] args) {
     arrayPopulator();
 }
}
        
    

