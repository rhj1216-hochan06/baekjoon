package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] S = new String[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			S[i] = br.readLine();
		}

		String[] arr = new String[M];
		for (int i = 0; i < M; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i].equals(S[j])) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
