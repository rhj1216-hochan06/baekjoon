package test;

import java.util.Scanner;
import java.util.Stack;

public class test4949_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			Stack<Character> list = new Stack<Character>();
			String str = sc.nextLine();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(' || str.charAt(i) == '[') { 
					list.add(str.charAt(i)); // add
				} else if (str.charAt(i) == ')') { 
					if (list.empty() == true) {
						list.add(str.charAt(i));
						break;
					} else {
						if (list.peek() == '(') {
							list.pop();
						} else {
							break;
						}
					} // ) ] end
				} else if (str.charAt(i) == ']') {
					if (list.empty() == true) {
						list.add(str.charAt(i));
						break;
					} else {
						if (list.peek() == '[') { 
							list.pop();
						} else {
							break;
						}
					} 
				}else if (str.equals(".")) {
					System.exit(0);
				} // ] end
			} // for end
			if (list.empty()) { 
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} // while end
	}
}