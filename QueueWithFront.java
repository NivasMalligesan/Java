class Queue {
    int [] queue_array;
    int size;
    int front;
    int rear;
    
    Queue(int size){
        this.size = size;
	    queue_array = new int[size];
	    front = rear = -1;
	    
	}
	
	public void enqueue(int val){
	    if(rear == size-1){
	        System.out.println("The queue is full");
	        return ;
	    }
	    if(rear == -1){
	        front = 0;
	    }
	   queue_array[++rear] = val;
	}
	
	public int dequeue(){
	    if(front == -1 || front > rear){
	        System.out.println("The queue is Empty");
	        return -1 ;
	    }
	    
	    return queue_array[front++];
	    
	}
	
	public void display(){
	    if(rear == -1){
	        System.out.println("The queue is Empty");
	    }
	   for(int i = front ; i <= rear ; i++){
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
        q1.enqueue(12);
        q1.display();
	}
}
