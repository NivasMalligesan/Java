public class Main
{
    public static int sum(int number){
        if(number == 0){
            return 0;
        }
        return number+sum(number-1);
    }    
    
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
}
