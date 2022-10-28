package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2445 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int k = 2 * N - i; k > 0; k--) {
				if (k > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int i = 2; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				System.out.print("*");
			}
			for (int k = 1; k < i * 2 - 1; k++) {
				System.out.print(" ");
			}
			for (int h = N; h >= i; h--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}