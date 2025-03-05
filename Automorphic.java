import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(IsAutomorphic(number)){
            System.out.printf("Automorphic");
        }
        else{
            System.out.printf("non Automorphic");
        }
    }
    static boolean IsAutomorphic(int number){
        int sq = number * number;
        while(number > 0){
            if(number%10 != sq % 10){
                return false;
            }else{
                number = number/10;
                sq = sq /10;
            }
        }
        return true;
    }
}
