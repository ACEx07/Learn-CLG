import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class binarytobst {

	public static class BST {

		private class Node {
			int data;
			Node left;
			Node right;

			Node(int data, Node left, Node right) {
				this.data = data;
				this.left = left;
				this.right = right;
			}
		}

		private int size = 0;
		private Node root = null;

		BST(int[] arr) {
//			this.root = makeBSTfrompre(arr, 0, arr.length - 1);
			this.root = makeBSTfrompreoptimised(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
		}

		BST(String s) {
			this.root = inputfromstring(s, this.root);
		}

		public static int i = 0;

		private Node makeBSTfrompreoptimised(int[] arr, int min, int max) {
			if (i >= arr.length || arr[i] < min || arr[i] > max) {
				return null;
			}
			Node node = new Node(arr[i++], null, null);
			node.left = makeBSTfrompreoptimised(arr, min, node.data);
			node.right = makeBSTfrompreoptimised(arr, node.data, max);
			return node;
		}

		private Node inputfromstring(String s, Node parent) {
			if (s.length() == 0) {
				return null;
			}
			Node node = new Node(0, null, null);
			int i = 0;
			while (i < s.length() && s.charAt(i) != '(') {
				i++;
			}
			int start = i + 1;
			String no = s.substring(0, i);
			node.data = Integer.parseInt(no);
			if (i < s.length()) {
				Stack<Character> stack = new Stack<>();
				stack.push(s.charAt(i));
				i++;
				while (!stack.isEmpty() && i < s.length()) {
					if (s.charAt(i) == '(') {
						stack.push(s.charAt(i));
					} else if (s.charAt(i) == ')') {
						stack.pop();
					}
					i++;
				}
				int end = i;
				String leftsub = s.substring(start, end - 1);
				node.left = inputfromstring(leftsub, node);
				if (end + 1 < s.length() - 1) {
					String rightsub = s.substring(end + 1, s.length() - 1);
					node.right = inputfromstring(rightsub, node);
				}
			}
			return node;

		}

		public void display() {
			display(this.root);
		}

		private void display(Node parent) {
			if (parent == null) {
				return;
			}
			String str = "";
			if (parent.left != null) {
				str += parent.left.data;
			}
			str += " => " + parent.data + " <= ";
			if (parent.right != null) {
				str += parent.right.data;
			}
			System.out.println(str);
			display(parent.left);
			display(parent.right);

		}

		public void inorder(Node parent, ArrayList<Integer> list) {
			if (parent == null) {
				return;
			}
			inorder(parent.left, list);
			list.add(parent.data);
			inorder(parent.right, list);
		}

		public void binarytobst() {
			this.root = binarytobst(this.root);
		}

		public Node binarytobst(Node parent) {
			ArrayList<Integer> inorder = new ArrayList<>();
			inorder(parent, inorder);
			Collections.sort(inorder);
			inorder2(parent, inorder);
			return parent;
		}

		public static int indx = 0;

		public void inorder2(Node parent, ArrayList<Integer> list) {
			if (parent == null) {
				return;
			}
			inorder2(parent.left, list);
			parent.data = list.get(indx++);
			inorder2(parent.right, list);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//successorandpre m = new successorandpre();
//		int[] arr = { 1, 2 };
//int[] arr = { 10, 5, 1, 7, 40, 50 };
//		int[] arr = { 1, 3 };
//		int[] arr = {};
		String s = "1(2)(3)";
		BST tree = new BST(s);
		tree.display();
		System.out.println();
		tree.binarytobst();
		tree.display();
	}
}