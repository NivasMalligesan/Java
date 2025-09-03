public class Main {
    public static void main(String [] args){
        int [] array = {3,23,43,12,2};
        for(int i = 1 ; i < array.length ; i++){
            int j = i;
            while(j > 0 && array[j-1] > array[j]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
