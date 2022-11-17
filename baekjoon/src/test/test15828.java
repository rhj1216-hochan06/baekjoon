package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class test15828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());
		int check = 0;

		while (check != -1) {
			check = Integer.parseInt(br.readLine());
			if (check == 0) {
				q.poll(); // 맨앞 버림
			} else {
				if (check > 0 && q.size() < N) {
					q.offer(check);
				}
			}
		}

		if (q.isEmpty()) {
			System.out.println("empty");
		} else {
			while (!q.isEmpty()) {
				System.out.print(q.poll() + " ");
			}
		}
	}
}