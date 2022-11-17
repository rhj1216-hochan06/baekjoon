package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1012 {

	static int[][] ground; // 2���� �迭�� ���߹��� ǥ���Ѵ�
	static boolean[][] check; // 2���� �迭�� ���߰� �ִ� ���� üũ�Ѵ�
	static int weight; // ���߹��� ����
	static int height; // ���߹��� ����

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			weight = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			ground = new int[weight][height];
			check = new boolean[weight][height];

			int K = Integer.parseInt(st.nextToken());
			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				ground[x][y] = 1; // ���� ��ǥ �Է�
			}
			// ===========================================================
			// ��������� �Էµ� ���� �����ϴ� �����̴�.

			int count = 0; // �׽�Ʈ ���̽����� �������� ������ �����Ѵ�

			// bfs�� ������ǥ�� �����ؼ� �ٸ� ���� ���ִ� ���ߵ鵵 �ľ��� �� �ְ��Ѵ�
			// ���� ���� ��ǥ���� �ϳ��� �Է����ְ�
			for (int j = 0; j < weight; j++) {
				for (int k = 0; k < height; k++) {

					// ��ǥ�� ���߰� �ִ��� Ȯ��, ���� üũ���� ������ Ȯ���Ѵ�
					if (ground[j][k] == 1 && !check[j][k]) {
						// ���߰� �ְ� üũ�ȵ� ��ǥ�������� dfs�� ����� ���� �ľ��Ѵ�
						dfs(j, k);

						// �������� ������ ������ ������ 1�����̴�.
						// ������ ���� ��� �ľ������� �����̸� �Ѹ��� ���´�.
						count++;
					}
				}
			}

			System.out.println(count);
		}

	}

	private static void dfs(int startX, int startY) {
		check[startX][startY] = true;
		// ������ǥ�� ���߰� ������ �̸� true�� ó�����ش�.

		int[] X = { 0, 0, -1, +1 };
		int[] Y = { -1, +1, 0, 0 };
		// ���߰� �����¿쿡 �����ϸ� �̵��� �� �ִ�.
		// ������ǥ���� �����¿� �����̴� ��ǥ�� �����Ѵ�.

		// �����¿� 4���� ����̴� for�� 4�� �ݺ�
		for (int i = 0; i < 4; i++) {
			int x = startX + X[i];
			int y = startY + Y[i];
			// �����¿� ��ǥ ����

			// ��ǥ�� ���߹��� ����ԵǸ� ���� ��ǥ�� üũ�ؾ��Ѵ�
			if (x < 0 || x >= weight || y < 0 || y >= height) {
				continue;
			}

			// �����¿� ������ ��ǥ�� ���߰� �ְ�, üũ���� ���� ��ǥ�̸�
			if (ground[x][y] == 1 & !check[x][y]) {
				dfs(x, y); // �ش� ��ǥ�� dfs ����
			}

		}

	}

}
