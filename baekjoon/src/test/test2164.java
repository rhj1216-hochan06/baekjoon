package test;

import java.util.Queue;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			q.offer(i); // 1234순으로 넣기
		}
		while (q.size() > 1) {
			q.poll(); // 맨앞 버림
			q.offer(q.poll()); // 가장 아래로 내리기
		}
		System.out.println(q.poll());
	}
}