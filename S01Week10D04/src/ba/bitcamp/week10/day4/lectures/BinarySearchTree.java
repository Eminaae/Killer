package ba.bitcamp.week10.day4.lectures;

public class BinarySearchTree<T extends Comparable<T>> {

	private Node root;

	private class Node {
		public T value;
		public Node left;
		public Node right;

		/**
		 * @param value
		 * @param left
		 * @param right
		 */
		public Node(T value) {
			this.value = value;

		}

		public void add(T value) {
			if (root == null) {
				root = new Node(value);
				return;
			}
			add(root, value); // private method, current root and value,
								// checking if num we're inserting >= root

		}

		private void add(Node subRoot, T value) { // subRoot current root of a
													// new tree. 1. check if
													// value is >= value

			if (value.compareTo(subRoot.value) <= 0) {
				if (subRoot.left == null) {
					subRoot.left = new Node(value);
					return;
				}
				add(subRoot.left, value);
			} else {
				if (subRoot.right == null) {
					subRoot.right = new Node(value);
					return;
				}
				add(subRoot.right, value);// if value is > goes right
			}
		}

		public void printTree() {
			printTree(root);

		}

		private void printTree(Node subRoot) {
			if (subRoot == null)
				return;
			printTree(subRoot.left);
			System.out.println(subRoot.value);
			printTree(subRoot.right);
		}

		public String toString() {
			return value.toString();
		}

	}

	public static void main(String[] args) {

	}

}