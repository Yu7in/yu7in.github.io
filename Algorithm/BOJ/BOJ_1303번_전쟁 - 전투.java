//BOJ_1303번_전쟁 - 전투

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());

		char[][] arr = new char[M][N];
		for (int i = 0; i < M; i++) {
			arr[i] = br.readLine().toCharArray();
		}

		int ansW = 0;
		int ansB = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] != '.') {
					int cnt = 0;
					char ch = arr[i][j];
					Queue<int[]> q = new LinkedList<int[]>();
					q.add(new int[] { i, j });
					arr[i][j] = '.';
					while (!q.isEmpty()) {
						cnt++;
						int[] temp = q.poll();
						for (int k = 0; k < dirs.length; k++) {
							int dx = temp[0] + dirs[k][0];
							int dy = temp[1] + dirs[k][1];
							if (dx >= 0 && dy >= 0 && dx < M && dy < N) {
								if (arr[dx][dy] == ch) {
									q.add(new int[] { dx, dy });
									arr[dx][dy] = '.';
								}
							}
						}
					}
					if (ch == 'W') {
						ansW += cnt * cnt;
					} else {
						ansB += cnt * cnt;
					}
				}
			}
		}

		sb.append(ansW).append(" ").append(ansB);
		System.out.println(sb);
	}
}