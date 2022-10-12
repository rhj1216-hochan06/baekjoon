package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test10815 {

	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] Arr = new int[N];
		for (int i = 0; i < N; i++) {
			Arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(Arr);

		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int m = Integer.parseInt(st.nextToken());
			int left = 0;
			int right = N - 1;
			while (left <= right) {
				int mid = (left + right) / 2;
				int n = Arr[mid];
				if (n == m) {
					sb.append(1 + " ");
					break;
				}
				if (n > m) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
				if (left > right) {
					sb.append(0 + " ");
					break;
				}
			}
		}
		System.out.println(sb.toString());
	}

}