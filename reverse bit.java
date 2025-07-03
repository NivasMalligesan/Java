//reverse bit
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	       int decimal = 4;
	       String binaryString = Integer.toBinaryString(decimal);
	       String reverse = new StringBuilder(binaryString).reverse().toString();
	       int revDeci = 0;
	       int power = 0;
	       for(int i = reverse.length() - 1 ; i >= 0 ; i--){
	           char bit = reverse.charAt(i);
	           if(bit == '1'){
	               revDeci += Math.pow(2,power);
	           }
	           power++;
	       }
	       
	       System.out.println(reverse);
	       System.out.println(decimal);
	       System.out.println(revDeci);
	       
	}
}
