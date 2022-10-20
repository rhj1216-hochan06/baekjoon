package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정
		StringTokenizer sub = new StringTokenizer(br.readLine(), "-");

		while (sub.hasMoreTokens()) {
			int temp = 0;
			// 빼기로 숫자들구분하여 더해줄것 그후 빼기진행해야 최솟값
			StringTokenizer plus = new StringTokenizer(sub.nextToken(), "+");
			while (plus.hasMoreTokens()) {
				temp += Integer.parseInt(plus.nextToken());
			}
			// 가장 앞의수는 무조건 양수
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}

}