// BOJ_4963번_섬의 개수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int w, k;
	public static int[][] arr;
	public static int[][] dirs = { { -1, -1 }, { 0, -1 }, { 1, -1 }, { -1, 0 }, { 1, 0 }, { -1, 1 }, { 0, 1 },
			{ 1, 1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			w = Integer.parseInt(tokens.nextToken());
			k = Integer.parseInt(tokens.nextToken());

			if (w == 0 && k == 0)
				break;

			arr = new int[k][w];
			for (int i = 0; i < k; i++) {
				tokens = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					arr[i][j] = Integer.parseInt(tokens.nextToken());
				}
			}

			int cnt = 0;
			boolean[][] visited = new boolean[k][w];
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < w; j++) {
					if (arr[i][j] == 1 && !visited[i][j]) {
						cnt++;
						Queue<int[]> q = new LinkedList<int[]>();
						q.add(new int[] { i, j });
						visited[i][j] = true;
						while (!q.isEmpty()) {
							int[] temp = q.poll();
							for (int d = 0; d < dirs.length; d++) {
								int dx = temp[0] + dirs[d][0];
								int dy = temp[1] + dirs[d][1];
								if (dx >= 0 && dy >= 0 && dx < k && dy < w) {
									if (!visited[dx][dy] && arr[dx][dy] == 1) {
										visited[dx][dy] = true;
										q.add(new int[] { dx, dy });
									}
								}
							}
						}
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
	}
}
