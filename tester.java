

public class tester {


 private static double[] array = new double[5];

    public static void populator(){
        

        for (int i = 0; i < array.length;){
            array[i] = Math.random() *100;
            System.out.println(array[i]);
            i++;
            
        }
    }
    





    public static void main(String[] args) {
      
    populator();
}


}