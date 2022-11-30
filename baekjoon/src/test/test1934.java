package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1934 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int tastcase = 0; tastcase < T; tastcase++) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int d = gcd(A, B);
			System.out.println("gcd: "+d);
			sb.append(A * B / d).append('\n');
		}
		System.out.println(sb.toString());
	}

	public static int gcd(int A, int B) {
		while (B != 0) {
			int r = A % B;
			
			A = B;
			B = r;
			System.out.println("r: "+r+", A: "+A+", B: "+B);
		}
		return A;
	}
}