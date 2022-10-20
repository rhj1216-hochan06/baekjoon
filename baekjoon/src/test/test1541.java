package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE; // �ʱ� ���� ���� Ȯ���� ���� ������ ����
		StringTokenizer sub = new StringTokenizer(br.readLine(), "-");

		while (sub.hasMoreTokens()) {
			int temp = 0;
			// ����� ���ڵ鱸���Ͽ� �����ٰ� ���� ���������ؾ� �ּڰ�
			StringTokenizer plus = new StringTokenizer(sub.nextToken(), "+");
			while (plus.hasMoreTokens()) {
				temp += Integer.parseInt(plus.nextToken());
			}
			// ���� ���Ǽ��� ������ ���
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}

}