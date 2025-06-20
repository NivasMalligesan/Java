//Print ASCII value for each character in given string
import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        for(int i  : string.toCharArray()){
            System.out.println(i);
        }
    }
    
} 
