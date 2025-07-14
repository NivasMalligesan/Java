class BinaryTree{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data = val;
            left = right = null;
        }
    }
    Node root;
    BinaryTree(int val){
        root = new Node(val);
    }
    public void InsertLeft(Node node,int val){
        Node newNode = new Node(val);
        node.left = newNode;
    }
    public void InsertRight(Node node,int val){
        Node newNode = new Node(val);
        node.right = newNode;
    }
    
    public void preOrder(Node node){
        if(node != null){
            System.out.print(node.data +" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void InOrder(Node node){
        if(node != null){
            InOrder(node.left);
            System.out.print(node.data +" ");
            InOrder(node.right);
        }
    }
    public void PostOrder(Node node){
        if(node != null){
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.data +" ");
        }
    }


}
public class Main
{
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(10);
		tree.InsertLeft(tree.root,20);
		tree.InsertRight(tree.root,30);
		tree.InsertLeft(tree.root.left,40);
		tree.InsertRight(tree.root.left,50);
		tree.InsertLeft(tree.root.right,60);
		tree.InsertRight(tree.root.right,70);
		System.out.println("PreOrder");
	    tree.preOrder(tree.root);
	    System.out.println();
		System.out.println("InOrder");
	    tree.InOrder(tree.root);
	    System.out.println();
		System.out.println("PostOrder");
	    tree.PostOrder(tree.root);
	}
}
