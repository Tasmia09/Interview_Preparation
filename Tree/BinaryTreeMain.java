public class BinaryTreeMain{
	public static void main(String [] args) {
		BinaryTree bt = new BinaryTree();
		TreeNode root = new TreeNode(50);
		bt.insert(root,76);
		bt.insert(root,21);
		bt.insert(root,4);
		bt.insert(root,32);
		bt.insert(root,100);
		bt.insert(root,64);
		bt.insert(root,52);
		
		bt.traverseInOrder(root);
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
	
	public boolean findElement(TreeNode current, int value) {
		if(current == null)
			return false;
		if(current.element == value)
			return true;
		return value < current.element ? findElement(current.left, value)
									   : findElement(current.right, value);
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
