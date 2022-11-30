package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class test1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> a = new LinkedList<Integer>();
		LinkedList<Integer> b = new LinkedList<Integer>();
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			b.add(Integer.parseInt(st.nextToken()));
		}

		int count = 0;

		int k = 0;
		for (int i = 0; i < A; i++) {
			k = a.get(i);

			if (b.contains(k)) {

				count++;
			}
		}

		for (int i = 0; i < B; i++) {
			k = b.get(i);

			if (a.contains(k)) {

				count++;
			}
		}

		System.out.println(count);
	}
}