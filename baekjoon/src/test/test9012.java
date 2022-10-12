package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			sb.append(count(br.readLine())).append('\n');
		}
		System.out.println(sb);
	}
	public static String count(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				count++;
			} else if (count == 0) {
				return "NO";
			} else {
				count--;
			}
		}
		if (count == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
