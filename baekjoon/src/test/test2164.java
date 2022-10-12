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
			q.offer(i); // 1234������ �ֱ�
		}
		while (q.size() > 1) {
			q.poll(); // �Ǿ� ����
			q.offer(q.poll()); // ���� �Ʒ��� ������
		}
		System.out.println(q.poll());
	}
}