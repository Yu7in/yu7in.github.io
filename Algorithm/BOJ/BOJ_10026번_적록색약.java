// BOJ_10026번_적록색약

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		char[][] arr = new char[N][N];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			arr[i] = str.toCharArray();
		}

		int cnt1 = 0;
		boolean[][] visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					cnt1++;
					char ch = arr[i][j];
					Queue<int[]> q = new LinkedList<int[]>();
					q.add(new int[] { i, j });
					visited[i][j] = true;
					while (!q.isEmpty()) {
						int[] temp = q.poll();
						for (int k = 0; k < dirs.length; k++) {
							int dx = temp[0] + dirs[k][0];
							int dy = temp[1] + dirs[k][1];
							if (dx >= 0 && dy >= 0 && dx < N && dy < N) {
								if (!visited[dx][dy] && arr[dx][dy] == ch) {
									q.add(new int[] { dx, dy });
									visited[dx][dy] = true;
								}
							}
						}
					}
				}
			}
		}

		int cnt2 = 0;
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					cnt2++;
					char ch = arr[i][j];
					Queue<int[]> q = new LinkedList<int[]>();
					q.add(new int[] { i, j });
					visited[i][j] = true;
					while (!q.isEmpty()) {
						int[] temp = q.poll();
						for (int k = 0; k < dirs.length; k++) {
							int dx = temp[0] + dirs[k][0];
							int dy = temp[1] + dirs[k][1];
							if (dx >= 0 && dy >= 0 && dx < N && dy < N) {
								if (!visited[dx][dy] && ch == 'B' && arr[dx][dy] == ch) {
									q.add(new int[] { dx, dy });
									visited[dx][dy] = true;
								} else if (!visited[dx][dy] && ch != 'B' && arr[dx][dy] != 'B') {
									q.add(new int[] { dx, dy });
									visited[dx][dy] = true;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(cnt1 + " " + cnt2);
	}
}
