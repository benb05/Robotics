public class averageFinder {
    //purpose of class is to find the average of an array

  private static int[] targetArray;
    private static int[] arrayPopulator(){
        

        targetArray = new int [10];

        for(int i = 0; i < targetArray.length; i++){
            
            targetArray[i] = (int)(Math.random()*10);


        }
        for(int i = 0; i <= targetArray.length-1; i++){
            System.out.println(targetArray[i]);
        }
       return targetArray;
        }

        private static void average(){
            double sum = 0;
            for (int i = 0; i <= targetArray.length-1; i++){
               double element = targetArray[i]; 
                
               sum += element;
                
               
            
            }
            
            double average = (sum /= targetArray.length);
            System.out.println("The average of this array is");
            System.out.println(average);
        }
            
        
    
        
 public static void main(String[] args) {
     arrayPopulator();
     average();
 }
}
        
    

