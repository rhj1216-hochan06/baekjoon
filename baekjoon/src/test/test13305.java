package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] d = new long[N - 1]; // �Ÿ�
		long[] c = new long[N]; // ���

		// �Ÿ�
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N - 1; i++) {
			d[i] = Long.parseLong(st.nextToken());
		}

		// ���ʹ� ��
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			c[i] = Long.parseLong(st.nextToken());
		}
		long sum = 0;
		long temp = c[0]; // �ּ� �⸧��
		for (int i = 0; i < N - 1; i++) {
			if (c[i] < temp) {
				temp = c[i];
			}
			sum += (temp * d[i]);
		}
		System.out.println(sum);
	}
}