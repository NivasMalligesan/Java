import java.util.*;

class Main{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        for(char character : str.toCharArray()){
            if(character == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
