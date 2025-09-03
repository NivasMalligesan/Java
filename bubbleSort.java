public class Main {
    public static void main(String [] args){
        int [] array = {3,23,43,12,2};
        boolean swapped;
        for(int i = 0 ; i < array.length-1 ; i++){
            swapped = false;
            for(int j = 0 ; j < array.length-i-1 ;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
