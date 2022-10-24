package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] d = new long[N - 1]; // 거리
		long[] c = new long[N]; // 비용

		// 거리
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N - 1; i++) {
			d[i] = Long.parseLong(st.nextToken());
		}

		// 리터당 값
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			c[i] = Long.parseLong(st.nextToken());
		}
		long sum = 0;
		long temp = c[0]; // 최소 기름값
		for (int i = 0; i < N - 1; i++) {
			if (c[i] < temp) {
				temp = c[i];
			}
			sum += (temp * d[i]);
		}
		System.out.println(sum);
	}
}