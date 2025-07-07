class DoublyCircularLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data = val;
            prev = null;
            next = null;
        
    }
        }
        Node head;
        public void insertBegining(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                newNode.next = newNode;
                newNode.prev = newNode;
            }else{
                Node tail = head.prev;
                newNode.next = head;
                newNode.prev = tail;
                tail.next = newNode;
                head.prev = newNode;
                head = newNode;
            }
        }
        public void insertLast(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                newNode.next = newNode;
                newNode.prev = newNode;
            }else{
                Node tail = head.prev;
                tail.next = newNode;
                newNode.prev = tail;
                newNode.next = head;
                head.prev = newNode;
            }
        }
        public void insertPosition(int position,int val){
            Node newNode = new Node(val);
            Node traversal = head;
            for(int i = 1 ; i < position-1 ; i++){
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
            do{
                 System.out.print(traversal.data+"->");
                traversal = traversal.next;
            }
            while(traversal != head);
        }
        
}
public class Main
{
	public static void main(String[] args) {
		DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
		dcll.insertBegining(10);
		dcll.insertLast(40);
		dcll.insertBegining(20);
		dcll.insertBegining(30);
		dcll.insertPosition(2,50);
		dcll.display();
	}
}
