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

		int N = Integer.parseInt(st.nextToken()); // ť�� ũ��(1 ~ N)
		int M = Integer.parseInt(st.nextToken());// �������� ������ ����
		// 1���� N���� ���� ��Ƶд�.
		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		}

		int[] seq = new int[M]; // �̰��� �ϴ� ���� ���� �迭

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < M; i++) {
			int target_idx = deque.indexOf(seq[i]);
			int half_idx;

			if (deque.size() % 2 == 0) {
				half_idx = deque.size() / 2 - 1;// ���� ���� ���� ���Ұ� ¦�� ����� �߰� ������ ���� ���� ���� ũ�⿡�� -1 ���ҽ�Ų��.
			} else {
				half_idx = deque.size() / 2;
			}

			if (target_idx <= half_idx) {
				// idx ���� �տ� �ִ� ���ҵ��� ��� �ڷ� ������.
				for (int j = 0; j < target_idx; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			} else { // �߰� �������� ������ ��ġ�� �ڿ� �ִ� ���
				// idx�� ������ �ڿ� �ִ� ���ҵ��� ��� ������ ������.
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