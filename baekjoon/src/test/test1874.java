package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class test1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // ����� ����� ����
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		int start = 0;

		// N �� �ݺ�
		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input > start) {
				// start + 1���� �Է¹��� input ���� push�� �Ѵ�.
				for (int j = start + 1; j <= input; j++) {
					stack.push(j);
					sb.append('+').append('\n'); // + �� �����Ѵ�.
				}
				start = input; // ���� push �� ���� ���������� �����ϱ� ���� ���� �ʱ�ȭ
			}
			// input < start, �Ұ�
			else if (stack.peek() != input) {
				System.out.println("NO");
				System.exit(0);
			} 
				//���� �Ҷ�
				stack.pop();
				sb.append('-').append('\n');
			
		}
		System.out.println(sb);
	}

}