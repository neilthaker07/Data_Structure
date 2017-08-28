package progs;

import java.util.ArrayList;
public class SymmTree {

	public static void main(String[] args) {
		TreeNode2 t1= new TreeNode2(5);
		TreeNode2 t2= new TreeNode2(2);
		TreeNode2 t3= new TreeNode2(2);
		TreeNode2 t4= new TreeNode2(3);
		TreeNode2 t5= new TreeNode2(3);
		t1.left=t2;
		t1.right=t3;
		t2.right=t4;
		t3.right=t5;
		SymmTree ma = new SymmTree();
		
		ArrayList<TreeNode2> at2 = new ArrayList<TreeNode2>();
		at2.add(t1);
		
		System.out.println(ma.isBalanced(at2));
		
		System.out.println(single());
	}
	
	public static int single()
	{
		int a[] = new int[]{1,4,3,1,3,2,4};
		int r = 0;
		for(int i=0;i<a.length;i++)
		{
			r = r^a[i];
		}
		return r;
	}

	 public boolean isBalanced(ArrayList<TreeNode2> node) 
	 {
		 ArrayList<TreeNode2> childNodes = new ArrayList<TreeNode2>();
		 
		 for(int i=0;i<node.size();i++)
		 {
			 if(node.get(i)!=null)
			 {
				 childNodes.add(node.get(i).left);
				 childNodes.add(node.get(i).right);
			 }
		 }
		 int j=childNodes.size()-1;
		 for(int i=0;i<childNodes.size()/2;i++)
		 {
			 if(childNodes.get(i)==childNodes.get(j) || (childNodes.get(i)!=null && childNodes.get(j)!=null && childNodes.get(i).val==childNodes.get(j).val))
			 {
				 j--;
			 }
			 else
			 {
				 return false;
			 }
		 }
		 
		 boolean pf = false;
		 for(int i=0;i<childNodes.size();i++)
		 {
			 if(childNodes.get(i)!=null)
			 {
				 pf= true;
			 }
		 }
		 if(pf)
		 {
			 return isBalanced(childNodes);
		 }
		 else
		 {
			 return true;
		 }
	 }
}

class TreeNode2 {
	int val;
	TreeNode2 left;
	TreeNode2 right;

	TreeNode2(int x) {
		val = x;
	}
}