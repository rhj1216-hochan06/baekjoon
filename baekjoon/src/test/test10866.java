package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class test10866{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			// 첫 번째 단어에 대한 switch-case
			switch (s[0]) {
			case "push_front": {
				ad.addFirst(Integer.parseInt(s[1]));
				break;
			}
			case "push_back": {
				ad.addLast(Integer.parseInt(s[1]));
				break;
			}
			case "pop_front": {
				if (ad.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(ad.pollFirst()).append('\n');
				}
				break;
			}
			case "pop_back": {
				if (ad.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(ad.pollLast()).append('\n');
				}
				break;
			}
			case "size": {
				sb.append(ad.size()).append('\n');
				break;
			}
			case "empty": {
				if (ad.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				break;
			}
			case "front": {
				if (ad.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(ad.peekFirst()).append('\n');
				}
				break;
			}
			case "back": {
				if (ad.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(ad.peekLast()).append('\n');
				}
				break;
			}
			}
		}
		System.out.println(sb);
	}
}