
class Student{
    int roll;
    String name; 
    
    Student(){
        roll = 100;
        name ="Nivas"; 
        System.out.println("Default Constructor");
    }
    
    Student(int roll){
        this.roll = roll;
        System.out.println("Parameterized Argument");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll : "+s1.roll+ " Name : "+s1.name);
        Student s2 = new Student(12);
        System.out.println("Roll : "+s2.roll+ " Name : "+s2.name);
    }
} 
