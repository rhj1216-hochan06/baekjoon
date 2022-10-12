package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test3226 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int cost = 0;

		int H, M, T;// �� �� ��ȭ�ð�
		int t1,t2;// �ʰ� ����, ��� �ð� - �ʰ� ����
		int N = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			String a[] = s1.split(":");
			H = Integer.parseInt(a[0]);
			M = Integer.parseInt(a[1]);
			T = Integer.parseInt(s2);
			//��+���ð��� �ð����� �ǵ����� ������
			if (M + T < 60) {
				if (7 <= H && H < 19) {
					cost += T * 10;
				} else {
					cost += T * 5;
				}
			}
			//��+���ð��� �ð����� �ǵ��� ��
			else {
				t1=(M+T)-60; //�ʰ� ����
				t2=T-t1; //��� �ð� - �ʰ� ����
				if (7 <= H && H < 19) {
					cost += t2 * 10;
				} else {
					cost += t2 * 5;
				}
				H += 1;
				if (7 <= H && H < 19) {
					cost += t1 * 10;
				} else {
					cost += t1 * 5;
				}
				
			}
			
		}
		sb.append(cost);
		System.out.println(sb.toString());
	}

}