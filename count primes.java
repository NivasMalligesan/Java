//count primes
public class Main
{
	public static void main(String[] args) {
	       int start =2 ;
	       int end = 10;
	       int count = 0 ;
	       
	       for(int i = start ; i < end ; i++){
	            int prime = 1;
	           for(int j = 2 ; j * j <= i ; j++){
	               if(i % j == 0){
	                   prime = 0;
	               }
	           }
	           if(i == 2){
	               prime =1;
	           }
	           if(prime == 1){
	               count++;
	           }
	       }
	       
	       System.out.println(count);
	}
}
