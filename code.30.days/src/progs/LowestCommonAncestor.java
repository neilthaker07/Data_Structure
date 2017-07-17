package progs;

import java.util.Scanner;

public class LowestCommonAncestor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node12 root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		Node12 qwe  = lca(root,1,2);
		System.out.println(qwe!=null ? qwe.data: null);
	}

	public static Node12 insert(Node12 root, int data) {
		if (root == null) {
			return new Node12(data);
		} else {
			Node12 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	static Node12 lca(Node12 root,int v1,int v2)
    {
		return process(root, v1, v2);
    }
	
	static Node12 process(Node12 root,int v1,int v2)
	{
		if((v1<root.data && v2>root.data) ||
				(v1>root.data && v2 <root.data) || v1==root.data || v2==root.data )
		{
			return root;
		}
		else if(v1==root.left.data || v2==root.left.data)
		{
			return root.left;
		}
		else if(v2==root.right.data ||v1==root.right.data )
		{
			return root.right;
		}
		else if(v1<root.data && v2<root.data)
		{
			return process(root.left, v1, v2);
		}
		else /*if(v1>root.data && v2>root.data)*/
		{
			return process(root.right, v1, v2);
		}
	}
}
