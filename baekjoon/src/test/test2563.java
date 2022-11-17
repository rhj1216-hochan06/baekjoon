package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; // 검은 영역의 넓이
		int n = Integer.parseInt(br.readLine()); // 색종이 개수
		boolean[][] arr = new boolean[101][101]; // 도화지
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!arr[j][k]) {
						arr[j][k] = true;
						sum++;
					}
				}
			}
		}
		System.out.print(sum);
	}
}