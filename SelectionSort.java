public class Main {
    public static void main(String [] args){
        int [] array = {3,23,43,12,2};
        for(int i = 0 ;i < array.length-1 ; i++){
            int minIndex = i;
            for(int j = i+1 ; j < array.length ; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            
            if(minIndex != i){
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
