package test;

import java.util.Scanner;
import java.util.Stack;

//    문자열은 영문 알파벳, 공백, 소괄호("( )") 대괄호("[ ]")각 줄은 마침표(".")로 끝난다. 
//  (  [  . 만 넣고 ) ] 일 때 빼고 / list 비어있을 때 넣기 

public class test4949_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			Stack<Character> list = new Stack<Character>();
			String str = sc.nextLine();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(' || str.charAt(i) == '[') { // '(' ' [' 라면
					list.add(str.charAt(i)); // add
				} else if (str.charAt(i) == ')') { // ')'라면
					if (list.empty() == true) {
						list.add(str.charAt(i));
						break;
					} else {
						if (list.peek() == '(') { // stack이 비어있다면
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
						if (list.peek() == '[') { // stack이 비어있다면
							list.pop();
						} else {
							break;
						}
					} 
				}else if (str.equals(".")) {
					System.exit(0);
				} // ] end
			} // for end
			if (list.empty()) { // stack 비어있는 유무 체크
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} // while end
	}
}