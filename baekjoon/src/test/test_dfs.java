package test;
import java.util.LinkedList;
import java.util.Stack;
	//import 실버.G.Node;
	
class Graph {
		//이너클래스로 노드를 정의
		class Node {
			int data;
			LinkedList<Node> adjacent;
			boolean marked;

			Node(int data) {
				this.data = data;
				this.marked = false;
				adjacent = new LinkedList<Node>();
			}
		}

		Node[] nodes; //노드 집합

		//생성자함수로 간단히 사이즈만큼의 노드집합크기를 선언하고, 1부터 차례로 노드를 넣음
		Graph(int size) {
			nodes = new Node[size];
			for (int i = 0; i < size; i++) {
				nodes[i] = new Node(i);
			}
		}

		//인접한 노드로 연결시켜주는 함수
		void addEdge(int i1, int i2) {
			Node n1 = nodes[i1];
			Node n2 = nodes[i2];
			if (!n1.adjacent.contains(n2)) {
				n1.adjacent.add(n2);
			}
			if (!n2.adjacent.contains(n1)) {
				n2.adjacent.add(n1);
			}
		}
		
		//dfs만 호출할시에 시작노드는 0번이다.
		void dfs() {
			dfs(0);
		}
		
		//DFS 표준 알고리즘 -> Stack 활용
		void dfs(int index) {
			Node root = nodes[index];
			Stack<Node> stack = new Stack<Node>();
			stack.push(root);
			root.marked = true;
			while (!stack.isEmpty()) {
				Node r = stack.pop();
				for (Node n : r.adjacent) {
					if (n.marked == false) {
						n.marked = true;
						stack.push(n);
					}
				}
				visit(r);
			}
		}

		//재귀를 활용한 DFS 알고리즘 : 스택대신 재귀함수
		void dfsR(Node r) {
			if (r == null)
				return;
			r.marked = true;
			visit(r);
			for (Node n : r.adjacent) {
				if (n.marked == false) {
					dfsR(n);
				}
			}
		}
		void dfsR(int index) {
			Node r = nodes[index];
			dfsR(r);
		}
		//그냥 output 메소드 : 방문한 노드의 데이터를 출력
		void visit(Node n) {
			System.out.print(n.data + " ");
		}
	}

	public class test_dfs {
		public static void main(String[] args) {
			Graph g = new Graph(9);
			g.addEdge(0, 1);
			g.addEdge(1, 2);
			g.addEdge(1, 3);
			g.addEdge(2, 4);
			g.addEdge(3, 4);
			g.addEdge(3, 5);
			g.addEdge(5, 6);
			g.addEdge(5, 7);
			g.addEdge(6, 8);
			
			g.dfs();
			
		}

	}

