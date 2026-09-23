public class MultiplicationOfArray {

    public static void main(String args[]){
        
        

        int[] arr = {1,2,3,4,5};


        int n = arr.length;
        int Multiplication = 1 ;

        for(int i = 0 ; i <= n-1 ; i++){

            int value = arr[i] ;

            Multiplication = Multiplication * value ; 

        

        }
        System.out.println("Multiplication of Array is : " + Multiplication );
    }
    
}
