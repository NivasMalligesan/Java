package test;


class Version1 {
	void display1(){
			System.out.println("Yellow Tag");
	}
}


public class Version2 extends Version1{
	void display2() {
		System.out.println("Blue Tag");
	}
	
	public static void main(String[] args) {
		Version2 catcher = new Version2();
		catcher.display1();
		catcher.display2();
		
	}
}
