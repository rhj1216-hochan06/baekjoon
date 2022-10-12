package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1331 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean check[][] = new boolean[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				check[i][j] = false;
			}
		}

		int firstX = 0, firstY = 0; // 처음방문 좌표
		int beforeX = 0, beforeY = 0;// 이전 방문 좌표

		for (int i = 0; i < 36; i++) {
			String str = br.readLine();
			char a = str.charAt(0);
			char b = str.charAt(1);
			int a1 = (a - 'A');
			int b1 = (b - '1');

			// 이전 방문 한적 있는지
			if (check[a1][b1] == false)
				check[a1][b1] = true;
			else {
				System.out.println(a1+" "+b1+" "+i);
				System.out.println("Invalid1");
				System.exit(0);

			}
			// 이전곳에서 이동이 가능한 좌표인지
			if (i == 0) {
				beforeX = a1;
				beforeY = b1;
			} else {
				// 이동가능하면
				if (Math.abs(beforeX - a1) * Math.abs(beforeX - a1)
						+ Math.abs(beforeY - b1) * Math.abs(beforeY - b1) == 5) {
					beforeX = a1;
					beforeY = b1;
				} else {
					System.out.println(a1+" "+b1+" "+i);
					System.out.println("Invalid2");
					System.exit(0);
				}
			}

			// 처음시작 좌표로 이동이 가능한지
			// 첫 좌표 기억
			if (i == 0) {
				firstX = a1;
				firstY = b1;
			} else if (i == 35) {
				if (Math.abs(firstX - a1) * Math.abs(firstX - a1)
						+ Math.abs(firstY - b1) * Math.abs(firstY - b1) == 5) {
					firstX = a1;
					firstY = b1;
				} else {
					System.out.println(a1+" "+b1+" "+i);
					System.out.println("Invalid3");
					System.exit(0);
				}
			}
		}
		System.out.println("Valid");
	}
}
