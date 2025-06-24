public class Main
{
    public static int rev(int number,int result){
        if(number == 0){
            return result;
        }
        int rem = number % 10;
        return rev(number/10 , result * 10 + rem );
    }    
    
	public static void main(String[] args) {
	    int result = 0;
		System.out.println(rev(1024,result));
	}
}
