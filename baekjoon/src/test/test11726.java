package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test11726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N + 2];

		for (int i = 1; i < arr.length - 1; i++) {
			if (i == 1)
				arr[i] = 1;
			else if (i == 2)
				arr[i] = 2;
			else
				arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
		}

		System.out.println(arr[N] % 10007);
	}
}
