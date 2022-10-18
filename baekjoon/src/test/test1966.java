package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class test1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int a = 0; a < T; a++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			LinkedList<int[]> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int b = Integer.parseInt(st.nextToken());
				q.offer(new int[] { i, b });
			}
			int count = 0; // ��� Ƚ��
			while (!q.isEmpty()) { // ���̽� �ѹ�
				int[] front = q.poll();
				boolean max = true; // front ���Ұ� ���� ū ���������� �Ǵ��ϴ� ��
				for (int i = 0; i < q.size(); i++) {
					// �߿䵵�� ����
					if (front[1] < q.get(i)[1]) {
						q.offer(front);
						for (int j = 0; j < i; j++) {
							q.offer(q.poll());
						}
						max = false;
						break;
					}
				}
				if (max == false) {// �߿䵵 ����
					continue;
				}
				// max==true
				count++;
				if (front[0] == M) { // ã�°����� Ȯ��
					break;
				}
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}
}