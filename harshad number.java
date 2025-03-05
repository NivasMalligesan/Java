import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(harshad(number)){
            System.out.printf("%d is a harshad Number ",number);
        }else{
            System.out.printf("%d is not a harshad number ",number);
        }
    }
    public static boolean harshad(int number){
        int temp = number;
        int sum = 0;
        while(temp > 0){
            int rem = temp % 10;
            sum = sum + rem;
            temp = temp  / 10;
        }
        
        if(number % sum == 0){
            return true;
        }else{
            return false;
        }
    }
}
