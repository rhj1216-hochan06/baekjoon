package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class test1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 출력할 결과물 저장
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		int start = 0;

		// N 번 반복
		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input > start) {
				// start + 1부터 입력받은 input 까지 push를 한다.
				for (int j = start + 1; j <= input; j++) {
					stack.push(j);
					sb.append('+').append('\n'); // + 를 저장한다.
				}
				start = input; // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
			}
			// input < start, 불가
			else if (stack.peek() != input) {
				System.out.println("NO");
				System.exit(0);
			} 
				//뱉어야 할때
				stack.pop();
				sb.append('-').append('\n');
			
		}
		System.out.println(sb);
	}

}