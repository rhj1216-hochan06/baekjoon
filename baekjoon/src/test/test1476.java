package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int i = 1;
		while (true) {
			if ((i - E) % 15 == 0 && (i - S) % 28 == 0 && (i - M) % 19 == 0)
				break;
			i++;
		}
		System.out.println(i);
	}
}
