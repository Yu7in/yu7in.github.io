//BOJ_2667번_단지번호붙이기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static int N;
	public static int[][] arr, area;
	public static int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}

		int num = 1;
		area = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1) {
					bfs(i, j, num++);
				}
			}
		}

		int[] ans = new int[num];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (area[i][j] != 0)
					ans[area[i][j]]++;
			}
		}

		Arrays.sort(ans);

		sb.append(num - 1).append("\n");
		for (int i = 1; i < ans.length; i++) {
			sb.append(ans[i]).append("\n");
		}

		System.out.println(sb);
	}

	public static void bfs(int x, int y, int num) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { x, y });
		area[x][y] = num;
		arr[x][y] = 0;
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			for (int i = 0; i < dirs.length; i++) {
				int dx = temp[0] + dirs[i][0];
				int dy = temp[1] + dirs[i][1];
				if (dx >= 0 && dy >= 0 && dx < N && dy < N) {
					if (arr[dx][dy] == 1) {
						q.add(new int[] { dx, dy });
						area[dx][dy] = num;
						arr[dx][dy] = 0;
					}
				}
			}
		}
	}
}