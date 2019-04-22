import java.util.*;
public class BFS{
	public static void main(String [] args) {
		BinaryTree bt = new BinaryTree();
		TreeNode root = new TreeNode(10);
		bt.insert(root,5);
		bt.insert(root,9);
		bt.insert(root,18);
		bt.insert(root,20);
		bt.insert(root,3);
		bt.insert(root,7);
		
		bt.BFS(root);
		
	}
}

class BinaryTree {
	
	public TreeNode insert(TreeNode current, int value) {
		if(current == null) //we have reached a leaf node
			return new TreeNode(value);
		
		if(value < current.element)
			current.left = insert(current.left, value);
		else if(value > current.element)
			current.right = insert(current.right, value);
		else
			return current; //value already exists
		return current;
	}
	
	void BFS(TreeNode root){
		Queue <TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty()){
			TreeNode current = q.remove();
			System.out.println(current.element);
			
			if(current.left != null)
				q.add(current.left);
			if(current.right != null)
				q.add(current.right);		
		}
	}
	
	public void traverseInOrder(TreeNode current) {
		if(current != null) {
			traverseInOrder(current.left);
			System.out.println(current.element + " ");
			traverseInOrder(current.right);
		}
	}
}
	
class TreeNode{
	int element;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int value){
		this.element = value;
		left = null;
		right = null;
	}
	
	
}
