import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; i++){
		   array[i] = scan.nextInt();
		}
		
		for(int i = 0 ; i < 5-1 ; i ++){
		    if(array[i] > array[i+1]){
		        int temp = array[i];
		        array[i] = array[i+1];
		        array[i+1] = temp;
		        i = -1;
		    }
		}
		
		
		LinkedList <Integer> link = new LinkedList<>();
		
		for(int i = 0 ; i < 5 ; i++){
		    if(i % 2 ==0){
		        link.addFirst(array[i]);
		    }else{
		        link.addLast(array[i]);
		    }
		}
		
		System.out.print(link);

	}
}
