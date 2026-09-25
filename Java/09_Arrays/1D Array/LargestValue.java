public class LargestValue {
    
    public static void main(String args[]){

        int [] arr = {23,45,23,12,56};

        int n = arr.length;

        int Maxvalue = arr[0];

        for(int i = 0 ; i < n ; i++){

            if( arr[i]  > Maxvalue){

                // Maxvalue Updated

                Maxvalue = arr[i];

            }

            else{

            }

            

        }

        System.out.println(Maxvalue);
    }
}
