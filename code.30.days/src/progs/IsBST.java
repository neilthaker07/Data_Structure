package progs;

public class IsBST {

	
	Node22 root = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsBST a = new IsBST();
		
		a.checkBST(a.root);
	}
	
	boolean checkBST(Node22 root) 
	{
        
		
		return false;
    }

}


class Node22 {
    int data;
    Node22 left;
    Node22 right;
 }