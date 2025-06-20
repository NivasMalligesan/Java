//6.Print Count of UPPER & lower case of given String
import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int Upper = 0 ;
        int Lower = 0 ;
        for(char i  : string.toCharArray()){
            if(Character.isUpperCase(i)){
                Upper++;   
            }else if (Character.isLowerCase(i)){
                Lower++;
            } 
        }
            System.out.println("Upper  :" + Upper +" Lower : "+Lower);
    }
    
} 
