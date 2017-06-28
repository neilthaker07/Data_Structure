package treesGraphs;

import java.util.Stack;

public class InOrderNoRecursion {
 
    NodeLocal root;
 
    void inorder() {
        if (root == null) {
            return;
        }
        
        //keep the nodes in the path that are waiting to be visited
        Stack<NodeLocal> stack = new Stack<NodeLocal>();
        NodeLocal node = root;
        stack.push(root);
        while(node.left!=null)
        {
        	stack.push(node.left);
        	node.left=node.left.left;
        }

       while(!stack.isEmpty())
       {
    	   NodeLocal t = stack.pop();
    	   System.out.println(t.data);
    	   if(t.right != null)
    	   {
    		   NodeLocal t3 = t.right;
    		   stack.push(t3);
    		   while(t3.left != null)
    		   {
    			   stack.push(t3.left);
    			   t3.left = t3.left.left;
    		   }
    		   NodeLocal t1 = stack.pop();
    		   System.out.println(t1.data);
    	   }
       }
    }
 
    public static void main(String args[]) {
         
        /* creating a binary tree and entering 
         the nodes */
    	InOrderNoRecursion tree = new InOrderNoRecursion();
        tree.root = new NodeLocal(1);
        tree.root.left = new NodeLocal(2);
        tree.root.right = new NodeLocal(3);
        tree.root.left.left = new NodeLocal(4);
        tree.root.left.right = new NodeLocal(5);
        tree.root.left.left.left = new NodeLocal(8);
        tree.root.left.left.right = new NodeLocal(9);
        tree.root.left.right.left = new NodeLocal(6);
        tree.root.left.right.right = new NodeLocal(7);
        tree.inorder();
    }
}


/*
 * Class containing left and right child of current node and key value
 */
class NodeLocal {

	int data;
	NodeLocal left, right;

	public NodeLocal(int item) {
		data = item;
		left = right = null;
	}
}
