//4.Print only lowercase of character in given  string
import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        for(char i  : string.toCharArray()){
            if(Character.isLowerCase(i)){
            System.out.println(i);
            }
                
        }
    }
    
} 
