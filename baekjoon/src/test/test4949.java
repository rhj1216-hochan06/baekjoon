package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class test4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (true) {
			s = br.readLine();
			if (s.equals(".")) {
				break;
			}
			sb.append(count(s)).append('\n');
		}
		System.out.println(sb);
	}
	public static String count(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
		
			if (c == '(' || c == '[') {
				stack.push(c);
			}
			
			else if (c == ')') {
				
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if (c == ']') {
			
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
		if (stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
