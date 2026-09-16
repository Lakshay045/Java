public class SumOfArray {

    public static void main(String args[]){
        
        

        int[] arr = {23,45,32,12,34};


        int n = arr.length;
        int sum = 0 ;

        for(int i = 0 ; i <= n-1 ; i++){

            int value = arr[i] ;

            sum = sum + value ; 

        

        }
        System.out.println("Sum of Array is : " + sum );
    }
    
}
