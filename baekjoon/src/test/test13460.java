package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class test13460 {
	static int N, M;
	static char[][] map;
	static boolean[][][][] visited;
	static int holeX, holeY;
	static Marble blue, red;

	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 }; // 0, 1, 2, 3 (��, ��, ��, ��) - �ð� ����

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new char[N][M];
		visited = new boolean[N][M][N][M];

		// ���� map ����
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j);

				if (map[i][j] == 'O') {
					holeX = i;
					holeY = j;
				} else if (map[i][j] == 'B') {
					blue = new Marble(0, 0, i, j, 0);
				} else if (map[i][j] == 'R') {
					red = new Marble(i, j, 0, 0, 0);
				}
			}
		}

		System.out.println(bfs());

		br.close();
	}

	public static int bfs() {
		Queue<Marble> queue = new LinkedList<>();
		queue.add(new Marble(red.rx, red.ry, blue.bx, blue.by, 1));
		visited[red.rx][red.ry][blue.rx][blue.ry] = true;

		while (!queue.isEmpty()) {
			Marble marble = queue.poll();

			int curRx = marble.rx;
			int curRy = marble.ry;
			int curBx = marble.bx;
			int curBy = marble.by;
			int curCnt = marble.cnt;

			if (curCnt > 10) { // �̵� Ƚ���� 10 �ʰ��� ����
				return -1;
			}

			for (int i = 0; i < 4; i++) {
				int newRx = curRx;
				int newRy = curRy;
				int newBx = curBx;
				int newBy = curBy;

				boolean isRedHole = false;
				boolean isBlueHole = false;

				// ���� ���� �̵� -> # ���� ���� ������ �̵�
				while (map[newRx + dx[i]][newRy + dy[i]] != '#') {
					newRx += dx[i];
					newRy += dy[i];

					// �̵� �� ������ ���� ���
					if (newRx == holeX && newRy == holeY) {
						isRedHole = true;
						break;
					}
				}

				// �Ķ� ���� �̵� -> # ���� ���� ������ �̵�
				while (map[newBx + dx[i]][newBy + dy[i]] != '#') {
					newBx += dx[i];
					newBy += dy[i];

					// �̵� �� ������ ���� ���
					if (newBx == holeX && newBy == holeY) {
						isBlueHole = true;
						break;
					}
				}

				if (isBlueHole) { // �Ķ� ������ ���ۿ� ������ ������ ����
					continue; // ������ ť�� ���� �ٸ� ��ǥ�� �����ϴ� ��������
				}

				if (isRedHole && !isBlueHole) { // ���� ������ ���ۿ� ������ ����
					return curCnt;
				}

				// �� �� ���ۿ� ������ �ʾҴµ� �̵��� ��ġ�� ���� ��� -> ��ġ ����
				if (newRx == newBx && newRy == newBy) {
					if (i == 0) { // �������� ����̱�
						// �� ū x���� ������ ������ �ڷ� ��
						if (curRx > curBx)
							newRx -= dx[i];
						else
							newBx -= dx[i];
					} else if (i == 1) { // ���������� ����̱�
						// �� ���� y���� ������ ������ �ڷ� ��
						if (curRy < curBy)
							newRy -= dy[i];
						else
							newBy -= dy[i];
					} else if (i == 2) { // �Ʒ������� ����̱�
						// �� ���� x���� ������ ������ �ڷ� ��
						if (curRx < curBx)
							newRx -= dx[i];
						else
							newBx -= dx[i];
					} else { // �������� ����̱�
						// �� ū y���� ������ ������ �ڷ� ��
						if (curRy > curBy)
							newRy -= dy[i];
						else
							newBy -= dy[i];
					}
				}

				// �� ������ �̵��� ��ġ�� ó�� �湮�ϴ� ���� ��츸 �̵� -> ť�� �߰�
				if (!visited[newRx][newRy][newBx][newBy]) {
					visited[newRx][newRy][newBx][newBy] = true;
					queue.add(new Marble(newRx, newRy, newBx, newBy, curCnt + 1));
				}
			}
		}

		return -1;
	}

}

class Marble {
	int rx;
	int ry;
	int bx;
	int by;
	int cnt;

	Marble(int rx, int ry, int bx, int by, int cnt) {
		this.rx = rx;
		this.ry = ry;
		this.bx = bx;
		this.by = by;
		this.cnt = cnt;
	}
}