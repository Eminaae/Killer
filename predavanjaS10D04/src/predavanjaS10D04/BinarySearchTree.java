package predavanjaS10D04;

public class BinarySearchTree <T extends Comparable<T>>{
	private Node root;
	
	public BinarySearchTree() {
	}

	private class Node {
		public T value;
		public Node left;
		public Node right;
		
		public Node (T value) {
			this.value = value;
		}
		
		public String toString () {
			return value.toString();
		}
	}
	
	public void add (T value) {
		if (root == null) {
			root = new Node (value);
			return;
		}
		add (root, value);
		
	}
	
	public void add (Node subRoot, T value) {
		if (value.compareTo(subRoot.value) <= 0) {
			if (subRoot.left == null) {
				subRoot.left = new Node (value);
				return;
			}
			add(subRoot.left, value);
		} else {
			if (subRoot.right == null) {
				subRoot.right = new Node (value);
				return;
			}
			add(subRoot.right, value);
		}
	}
	
	public void printTree () {
		printTree(root);
	}
	
	private void printTree (Node subRoot) {
		if (subRoot == null) {
			return;	
		}
		printTree(subRoot.left);
		System.out.print(subRoot.value + " ");
		printTree(subRoot.right);
	}
	
	private String toString () {
		return root.value + " ";
	}
	
	private String toString(Node subRoot, String str) {
		if (subRoot == null) {
			return str;
		}
		return str += subRoot.toString();
	}
	
	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(100);
		tree.add(1);
		tree.add(4);
		
		tree.printTree();

	}

}
