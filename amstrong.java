import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int temp = number;
        int sum = 0;
        
        while(temp > 0){
            int num = temp % 10;
            sum = sum + (num* num * num);
            temp = temp / 10;
        }
        
        if(sum == number){
        System.out.printf("%d is An amstrong number ",number);
        }else{
        System.out.printf("%d is not An amstrong number ",number);
            
        }
    }
}
