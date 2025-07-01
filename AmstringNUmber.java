import java.util.*;
public class Main
{   
    public static int Armstrong(int number,int digit){
        int sum = 0;
        while(number != 0){
            int rem = number % 10;
            sum += Math.pow(rem,digit);
            number/=10;
        }
        return sum;
    }
    
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
		if(number == Armstrong(number,digit)){
		    System.out.println("Amstrong NUmber");
		}else{
		    System.out.println("Non Amstrong NUmber");
		}
		    
		
		
	}
}
