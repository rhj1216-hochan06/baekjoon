package test;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		sb.append("<");
		for (int i = 1; i <= N; i++) {
			q.offer(i); // 1234순으로 넣기
		}
		while (!q.isEmpty()) {
			// K-1번 앞에 있는 원소를 뒤로 보낸다.
			for (int i = 0; i < K - 1; i++) {
				q.offer(q.poll());
			}
			if (q.size() == 1)
				sb.append(q.poll());
			else
				sb.append(q.poll() + ", ");
		}
		sb.append(">");
		System.out.println(sb.toString());
	}
}