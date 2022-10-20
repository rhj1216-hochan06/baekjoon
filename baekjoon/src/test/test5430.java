package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayDeque;

public class test5430 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		ArrayDeque<Integer> deque;
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int a = 0; a < T; a++) {
			deque = new ArrayDeque<Integer>();
			String p = br.readLine(); // �����ų� �����ϴ� ��Ʈ��
			int n = Integer.parseInt(br.readLine());

			st = new StringTokenizer(br.readLine(), "[],");
			// ���� �迭 ���Ҹ� �־��ش�.
			for (int i = 0; i < n; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			AC(p, deque);

		}
		System.out.println(sb);

	}

	public static void AC(String p, ArrayDeque<Integer> deque) {

		boolean isRight = true;

		for (char cmd : p.toCharArray()) {

			if (cmd == 'R') {
				isRight = !isRight; // ������ �ٲ��ش�.
				continue;
			}

			// �Ʒ��� D�� ���

			// D �Լ��̸鼭 isRight�� true �� ���
			if (isRight) {

				// ���� ��ȯ �� ���Ұ� ���� ��� error�� ����ϵ��� �ϰ� �Լ� ����
				if (deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}

			} else {
				// ���� ��ȯ �� ���Ұ� ���� ��� error�� ����ϵ��� �ϰ� �Լ� ����
				if (deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}
			}
		}

		// ��� �Լ����� ���������� �۵��ߴٸ� ���� ���� ��ҵ��� ��¹����� ������ش�.
		makePrintString(deque, isRight);

	}

	public static void makePrintString(ArrayDeque<Integer> deque, boolean isRight) {

		sb.append('['); // ���� ���ȣ ���� StringBuilder�� ����

		if (deque.size() > 0) { // ���� ��� �� ���Ұ� �� �� �̻��� ���

			if (isRight) { // �������ϰ��

				sb.append(deque.pollFirst()); // ���� ù ��° ���Ҹ� �Ѱ��ش�.

				// �� ���� ���Һ��� ������ ���� �Ѱ��� �� ���� ���Ҹ� �ϳ��� �̾� �ѱ��.
				while (!deque.isEmpty()) {
					sb.append(',').append(deque.pollFirst());
				}
			} else { // �������ϰ��
				sb.append(deque.pollLast()); // ���� �ڿ������� ù ��° ���Ҹ� �Ѱ��ش�.

				// �� ���� ���Һ��� ������ ���� �Ѱ��� �� ���� ���Ҹ� �ڿ������� �ϳ��� �̾� �ѱ��.
				while (!deque.isEmpty()) {
					sb.append(',').append(deque.pollLast());
				}
			}
		}

		sb.append(']').append('\n'); // �ݴ� ���ȣ �� �������� ������
	}
}