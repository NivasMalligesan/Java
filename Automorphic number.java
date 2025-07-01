import java.util.*;
public class Main
{   
    public static int count(int number){
        int count = 0;
        while(number != 0){
            number/=10;
            count++;
        }
        return count;
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int digit = count(number);
		int Square = (int) Math.pow(number,2);
		int div = (int) Math.pow(10,digit);
		int result = Square % div;
		if(result == number){
		    System.out.println("Automorphic number");
		}else{
		    System.out.println("Non Automorphic number");
		    
		}
	}
}
