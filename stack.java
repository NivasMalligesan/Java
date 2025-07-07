class Stack{
    int [] stack_arr;
    int top;
    int size;
    Stack(int size){
        this.stack_arr = new int[size];
        this.size = size;
        top =-1;
    }
    public void push(int val){
        if(top == size-1){
            System.out.println("Stack over flow");
        }else{
            stack_arr[++top] = val;
        }
    }
    public int peek(){
        return stack_arr[top];
    }
    public boolean isFull(){
        if(stack_arr.length-1 == top ){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is Empty");
            return 0;
        }else{
            return stack_arr[top--];
        }
    }
    
    public void display(){
        if(top != -1){
            for ( int i = 0 ; i <= top;i++ ){
                System.out.print(stack_arr[i]+" ");
            } 
        }
          return;  
    }
        
}
public class Main
{
	public static void main(String[] args) {
		Stack s1 = new Stack(3);
		s1.push(10);
		s1.push(30);
		s1.push(20);

		s1.display();
		System.out.println(s1.peek());
		System.out.println(s1.isEmpty());
		System.out.println(s1.isFull());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		s1.display();
	}
}
