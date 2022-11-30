package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test14889 {

	static int N;
	static int[][] map;
	static boolean[] visit;
	static int Min = Integer.MAX_VALUE;
	static int count=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		check(0, 0);
		System.out.println(Min);
	}

	static void check(int idx, int count) {
		System.out.println("check {");
		if (count == N / 2) {
			diff();
			return;
		}
		for (int i = idx; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true; // �湮���� ����
				
				System.out.println("i:"+i+", idx:"+idx+", count:"+count);
				check(i + 1, count + 1); // ��� ȣ��
				visit[i] = false; // ��Ͱ� ������ ��湮���� ����
			}
		}
		System.out.println("check }");
	}

	static void diff() {
		System.out.println("diff {");
		
		int team_start = 0;
		int team_link = 0;
		
		count++;
		System.out.println("count: "+count);
		
		
		
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				// i ��° ����� j ��° ����� true��� ��ŸƮ������ ���� �÷���
				if (visit[i] == true && visit[j] == true) {
					team_start += map[i][j];
					team_start += map[j][i];
					System.out.println("team_start: "+team_start);
					
				}
				// i ��° ����� j ��° ����� false��� ��ũ������ ���� �÷���
				else if (visit[i] == false && visit[j] == false) {
					team_link += map[i][j];
					team_link += map[j][i];
					System.out.println("team_link: "+team_link);
				}
			}
		}
		// �� ���� ���� ���� (����)
		int val = Math.abs(team_start - team_link);

		/*
		 * �� ���� �������� 0�̶�� ���� ���� �ּڰ��̱� ������ ���̻��� Ž�� �ʿ���� 0�� ����ϰ� �����ϸ� �ȴ�.
		 */
		if (val == 0) {
			System.out.println(val);
			System.out.println("diff 1}");
			System.exit(0);
		}

		Min = Math.min(val, Min);

		System.out.println("min: "+Min);
		System.out.println("diff }");
	}
}
