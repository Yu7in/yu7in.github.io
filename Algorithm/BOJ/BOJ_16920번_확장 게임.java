//BOJ_16920번_확장 게임

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
		int P = Integer.parseInt(tokens.nextToken());

		int[] len = new int[P + 1];
		tokens = new StringTokenizer(br.readLine());
		for (int i = 1; i <= P; i++) {
			len[i] = Integer.parseInt(tokens.nextToken());
		}

		ArrayList<Queue<int[]>> start = new ArrayList<>();
		for (int i = 0; i <= P; i++) {
			start.add(new LinkedList<>());
		}

		int total = 0;
		int[][] visited = new int[N][M];
		char[][] arr = new char[N][M];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j);
				if (arr[i][j] != '.' && arr[i][j] != '#') {
					int num = arr[i][j] - '0';
					start.get(num).add(new int[] { i, j });
					visited[i][j] = num;
					total++;
				} else if (arr[i][j] == '#') {
					total++;
				}
			}
		}

		while (total < N * M) {
			boolean check = false;

			for (int i = 1; i <= P; i++) {
				Queue<int[]> q = new LinkedList<>();
				while (!start.get(i).isEmpty()) {
					int[] temp = start.get(i).poll();
					q.add(new int[] { temp[0], temp[1], 0 });
				}

				while (!q.isEmpty() && total < N * M) {
					int[] temp = q.poll();
					for (int j = 0; j < dirs.length; j++) {
						int dx = temp[0] + dirs[j][0];
						int dy = temp[1] + dirs[j][1];
						if (dx >= 0 && dy >= 0 && dx < N && dy < M) {
							if (visited[dx][dy] == 0 && arr[dx][dy] == '.') {
								check = true;
								total++;
								visited[dx][dy] = i;
								if (temp[2] + 1 == len[i]) {
									start.get(i).add(new int[] { dx, dy });
								} else {
									q.add(new int[] { dx, dy, temp[2] + 1 });
								}
							}
						}
						if (total == N * M)
							break;
					}
				}

				if (total == N * M)
					break;
			}

			if (!check)
				break;
		}

		int[] ans = new int[P + 1];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				ans[visited[i][j]]++;
			}
		}

		for (int i = 1; i < ans.length; i++) {
			sb.append(ans[i]);
			if (i != ans.length - 1)
				sb.append(" ");
		}

		System.out.println(sb);
	}
}