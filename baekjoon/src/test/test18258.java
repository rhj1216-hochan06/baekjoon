package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class test18258 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> q = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			Integer item = 0;
			switch (st.nextToken()) {
			case "push":
				q.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				item = q.poll();
				if (item == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(item).append('\n');
				}
				break;
			case "size":
				sb.append(q.size()).append('\n');
				break;
			case "empty":
				if (q.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				break;
			case "front":
				item = q.peek();
				if (item == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(item).append('\n');
				}
				break;
			case "back":
				item = q.peekLast();
				if (item == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(item).append('\n');
				}
				break;
			}
		}
		System.out.println(sb);
	}
}