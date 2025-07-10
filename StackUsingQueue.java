import java.util.*;
class StackUsingQueue{
        Queue <Integer> queue = new LinkedList<>();
        public void push(int val){
            queue.add(val);
            for(int i =1 ; i < queue.size() ; i++){
                queue.add(queue.remove());
            }
                
        }
        public int pop(){
            return queue.remove();
        }
}

public class Main
{
	public static void main(String[] args) {
            StackUsingQueue stack = new StackUsingQueue();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println(stack.pop());
	}
}
