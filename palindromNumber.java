import java.util.*;
public class Main
{   
    public static boolean palindrom(int number){
        String numString = Integer.toString(number);
        int start = 0 ;
        int end = numString.length()-1;
        while(start <= end){
            if(numString.charAt(start)!= numString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		for(int i = start ; i <= end ; i++){
		    if(palindrom(i)){
		        System.out.print(i+" ");
		    }
		}
		
	}
}
