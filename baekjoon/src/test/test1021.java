package test;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class test1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> deque = new LinkedList<Integer>();
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 큐의 크기(1 ~ N)
		int M = Integer.parseInt(st.nextToken());// 뽑으려는 숫자의 개수
		// 1부터 N까지 덱에 담아둔다.
		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		}

		int[] seq = new int[M]; // 뽑고자 하는 수를 담은 배열

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < M; i++) {
			int target_idx = deque.indexOf(seq[i]);
			int half_idx;

			if (deque.size() % 2 == 0) {
				half_idx = deque.size() / 2 - 1;// 만약 현재 덱의 원소가 짝수 개라면 중간 지점을 현재 덱의 절반 크기에서 -1 감소시킨다.
			} else {
				half_idx = deque.size() / 2;
			}

			if (target_idx <= half_idx) {
				// idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다.
				for (int j = 0; j < target_idx; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			} else { // 중간 지점보다 원소의 위치가 뒤에 있는 경우
				// idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다.
				for (int j = 0; j < deque.size() - target_idx; j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					count++;
				}
			}
			deque.pollFirst();
		}
		System.out.println(count);
	}
}