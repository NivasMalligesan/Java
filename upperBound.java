import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = new int[]{1,2,3,3,5,5,5,8};
	    int start = 0;
	    int end = arr.length-1;
	    int target = 5;
	    int ans = arr.length-1;
	    
	    while(start <= end){
	        int mid = start + (end - start)/2;
	        if(arr[mid] <= target){
	            start = mid+1;
	            ans = mid;
	        }else{
	            end = mid-1;
	        }
	    }
	    
	    System.out.print(ans);
	}
}
