package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test5597 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		boolean[] a = new boolean[31];
		for (int i = 1; i < 31; i++)
			a[i] = false;

		int n = 0;

		for (int i = 1; i < 29; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken());
			a[n] = true;
		}

		for (int i = 1; i < 31; i++) {
			if (!a[i])
				System.out.println(i);
		}

	}
}