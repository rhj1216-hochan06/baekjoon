package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] a = new String[N];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String S = br.readLine();
			a[i] = S;
		}
		// ���ĺ� �� ����
		Arrays.sort(a);
		// ���̺� ����
		for (int i = 1; i < N; i++) {
			boolean swapped = false;
			for (int j = 0; j < N - i; j++) {
				if (a[j].length() > a[j + 1].length()) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		// ���� ���ڿ� ����
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				sb.append(a[i]).append('\n');
			} else if (a[i].equals(a[i - 1])) {
				continue;
			} else {
				sb.append(a[i]).append('\n');
			}
		}
		System.out.println(sb.toString());

	}

	private static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
