//4.Print only lowercase of character in given  string
import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int count = 0 ;
        for(char i  : string.toCharArray()){
            if(Character.isLetter(i)){
             count++;   
            }
        }
            System.out.println(count);
    }
    
} 
