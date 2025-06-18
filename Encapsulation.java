import java.util.*;
class Person{
    private String name;
    private int age;
    
    Person(String name ,  int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String name = scan.next();
	        int age = scan.nextInt();
	 
            Person person1 = new Person(name,age);
            System.out.println("Name : "+ person1.getName() + " Age : " + person1.getAge());
	}
}
