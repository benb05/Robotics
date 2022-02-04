public class averageFinder {
    //purpose of class is to find the average of an array

  private static int[] targetArray;
    private static int[] arrayPopulator(){
        

        targetArray = new int [10];

        for(int i = 0; i < targetArray.length; i++){
            
            targetArray[i] = (int)(Math.random()*10);


        }
        for(int i = 0; i <= targetArray.length; i++){
            System.out.println(targetArray[i]);
        }
       return targetArray;
        }

        private static void average(){
            int sum = 0;
            for (int i = 0; i <= targetArray.length; i++){
               int element = targetArray[i]; 
                
               sum += element;
                
               
            
            }
            
            double average = (sum /= targetArray.length);
            System.out.println("The average of this array is");
            System.out.println(average);
        }
            
        
    
        
 public static void main(String[] args) {
     arrayPopulator();
 }
}
        
    

