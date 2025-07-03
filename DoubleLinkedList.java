class DoubleLinkedList{
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int val){
            data = val;
            prev = null;
            next = null;
        }
    }
    
    public void insertInBegining(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void insertInEnd(int val){
        Node newNode = new Node(val);
        Node traversal = head;
        while(traversal.next != null){
            traversal = traversal.next;
        }
        traversal.next = newNode;
        newNode.prev = traversal;
    }
    public void insertInPosition(int val,int position){
        if(position == 1){
            insertInBegining(val);
            return ;
        }
        Node newNode = new Node(val);
        Node traversal = head;
        for(int i = 1 ; i < position-1 ; i ++){
            traversal = traversal.next;
        }
        newNode.next = traversal.next;
        newNode.prev = traversal;
        
        traversal.next.prev = newNode;
        traversal.next = newNode;
    }
    
    public void deleteAtFirst(){
        if(head == null){
            System.out.println("No Node found");
        }
        head.next.prev = null;
        head = head.next;
    }
    public void deleteAtEnd(){
        Node traversal = head;
        while(traversal.next.next != null){
            traversal = traversal.next;
        }
        traversal.next.prev = null;
        traversal.next = null;
    }
    public void deleteAtPosition(int position){
        Node traversal = head;
        for(int i = 1 ; i < position-1 ; i++){
            traversal = traversal.next;
        }
        traversal.next.next.prev = traversal;
        traversal.next = traversal.next.next;
    }
    public void sortedOrder(int val){
        Node newNode = new Node(val);
        if(head == null || head.data >= val){
            insertInBegining(val);
            return;
        }
        Node traversal = head;
        while(traversal.next != null && traversal.next.data < val){
            traversal = traversal.next;
        }
        newNode.next = traversal.next;
        newNode.prev = traversal;
        if(traversal.next != null){
            traversal.next.prev = newNode;
        }
        traversal.next = newNode;

    }
    
    public void display(){
        Node traversal = head;
        Node last = null;
        System.out.print("Forward Display : ");
        while(traversal != null){
            System.out.print(traversal.data + "->");
            last = traversal;
            traversal = traversal.next;
        }
        System.out.print("Null\n");
        
        System.out.print("Backward Display : ");
        while(last != null){
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.print("Null\n");
    }
    
    
}

public class Main
{
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		DoubleLinkedList dll2 = new DoubleLinkedList();
		dll.insertInBegining(10);
		dll.insertInBegining(20);
		dll.insertInBegining(30);
		dll.insertInEnd(40);
		dll.insertInPosition(50,2);
		dll.display();
		
		dll.deleteAtFirst();
		System.out.println("Delete At First : ");
		dll.display();
		System.out.println("Delete At End : ");
		dll.deleteAtEnd();
		System.out.println("Delete At 2 : ");
		dll.deleteAtPosition(2);
		dll.display();
		System.out.println("\n");
		System.out.println("Sorted order");
		dll2.sortedOrder(50);
		dll2.sortedOrder(34);
		dll2.sortedOrder(45);
		dll2.sortedOrder(49);
		
		
		dll2.display();
		
		
	}
}
