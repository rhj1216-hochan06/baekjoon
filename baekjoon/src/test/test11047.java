package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = Integer.parseInt(br.readLine());
		}
		int count = 0;
		for (int i = N - 1; i >= 0; i--) {
			if (C[i] <= K) {
				count += (K / C[i]);
				K = K % C[i];
			}
		}
		System.out.println(count);
	}

}