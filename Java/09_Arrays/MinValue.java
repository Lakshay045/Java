public class MinValue {
    
    public static void main(String args[]){

        int [] arr = {23,45,23,12,56};

        int n = arr.length;

        int Minvalue = arr[0];

        for(int i = 0 ; i < n ; i++){

            if( arr[i]  < Minvalue){

                // Maxvalue Updated

                Minvalue = arr[i];

            }

            else{

            }

            

        }

        System.out.println(Minvalue);
    }
}
