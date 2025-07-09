class Queue {
    int [] queue_array;
    int size;
    int rear;
    
    Queue(int size){
        this.size = size;
	    queue_array = new int[size];
	    rear = -1;
	    
	}
	
	public void enqueue(int val){
	    if(rear == size-1){
	        System.out.println("The queue is full");
	        return ;
	    }
	   queue_array[++rear] = val;
	}
	
	public int dequeue(){
	    if(rear == -1){
	        System.out.println("The queue is Empty");
	        return -1 ;
	    }
	    int result = queue_array[0];
	    for(int i = 0 ; i < rear ; i++){
	        queue_array[i] = queue_array[i+1];
	    }
	    rear--;
	    
	    return result;
	}
	
	public void display(){
	    if(rear == -1){
	        System.out.println("The queue is Empty");
	    }
	   for(int i = 0 ; i <= rear ; i++){
	       System.out.print(queue_array[i]+ " ");
	   }
	}
        

}

public class Main
{
	public static void main(String[] args) {
        Queue q1  = new Queue(3);
        q1.enqueue(19);
        q1.enqueue(19);
        q1.enqueue(12);
        q1.dequeue();
        q1.display();
	}
}
