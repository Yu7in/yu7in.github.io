//BOJ_9663번_N-Queen

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int N, ans;
	public static int[][] arr;
	public static boolean[][] visited;
	public static int[][] dirs = { { -1, -1 }, { -1, 0 }, { -1, 1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		ans = 0;
		arr = new int[N][N];
		visited = new boolean[N][N];
		findAns(0);

		System.out.println(ans);
	}

	public static void findAns(int n) {
		if (n == N) {
			ans++;
		} else {
			for (int i = 0; i < N; i++) {
				boolean check = true;
				for (int j = 0; j < dirs.length; j++) {
					int cnt = 1;
					while (true) {
						int dx = n + dirs[j][0] * cnt;
						int dy = i + dirs[j][1] * cnt;
						if (dx >= 0 && dy >= 0 && dx < N && dy < N) {
							if (arr[dx][dy] == 1) {
								check = false;
								break;
							}
						} else {
							break;
						}
						cnt++;
					}
					if (!check)
						break;
				}
				if (check) {
					arr[n][i] = 1;
					findAns(n + 1);
					arr[n][i] = 0;
				}
			}
		}
	}
}