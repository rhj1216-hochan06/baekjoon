package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2477 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[6];
		int MaxW1 = 0, MaxW2 = 0, MaxH1 = 0, MaxH2 = 0;
		int d = 0;
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			d = Integer.parseInt(st.nextToken());
			arr[i] = Integer.parseInt(st.nextToken());

			// 가장 긴 가로의 길이와 위치 찾기
			if ((d == 1 || d == 2) && MaxW1 < arr[i]) {
				MaxW1 = arr[i];
				MaxW2 = i;
			}
			// 가장 긴 세로의 길이와 위치 찾기
			else if ((d == 3 || d == 4) && MaxH1 < arr[i]) {
				MaxH1 = arr[i];
				MaxH2 = i;
			}
		}
		int right, left, minWidth, minHeight;
		if (MaxW2 + 1 == 6)
			right = 0;
		else
			right = MaxW2 + 1;

		if (MaxW2 - 1 == -1)
			left = 5;
		else
			left = MaxW2 - 1;
		// 빈 사각형의 세로 길이
		minHeight = Math.abs(arr[right] - arr[left]);

		if (MaxH2 + 1 == 6)
			right = 0;
		else
			right = MaxH2 + 1;

		if (MaxH2 - 1 == -1)
			left = 5;
		else
			left = MaxH2 - 1;
		// 빈 사각형의 가로 길이
		minWidth = Math.abs(arr[right] - arr[left]);

		System.out.println(((MaxW1 * MaxH1) - (minHeight * minWidth)) * N);
	}
}