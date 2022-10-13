package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		int N= Integer.parseInt(str);
		
		int result = 0;
		for(int i = 0; i < N; i++) {
			int number = i;
			int sum = 0;	// �� �ڸ��� �� ���� 
			
			while(number != 0) {
				sum += number % 10;	// �� �ڸ��� ���ϱ�
				number /= 10;
			}
			// i ���� �� �ڸ��� �������� ���� ��� (�����ڸ� ã���� ���) 
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		
	}
}



	