//8.Create a new string with digits followed by letters from given string

import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        StringBuffer digit= new StringBuffer();
        StringBuffer Letters= new StringBuffer();
        for(char i : string.toCharArray()){
            if(Character.isDigit(i)){
                digit.append(i);
            }else{
                Letters.append(i);
            }
        }
        
        System.out.println(digit.append(Letters));
    }
    
} 
