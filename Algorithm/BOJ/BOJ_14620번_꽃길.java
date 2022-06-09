import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int N, ans;
	public static int[][] arr;
	public static boolean[][] visited;
	public static int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(tokens.nextToken());
			}
		}

		ans = Integer.MAX_VALUE;
		visited = new boolean[N][N];
		findArea(0, 0);

		System.out.println(ans);
	}

	public static void findArea(int cnt, int sum) {
		if (cnt == 3) {
			ans = Math.min(ans, sum);
		} else {
			int dsum = 0;
			for (int i = 1; i < N - 1; i++) {
				for (int j = 1; j < N - 1; j++) {
					if (!visited[i][j] && visitedCheck(i, j)) {
						dsum += arr[i][j];
						visited[i][j] = true;
						for (int d = 0; d < dirs.length; d++) {
							int dx = i + dirs[d][0];
							int dy = j + dirs[d][1];
							dsum += arr[dx][dy];
							visited[dx][dy] = true;
						}
						
						findArea(cnt + 1, sum + dsum);

						dsum = 0;
						visited[i][j] = false;
						for (int d = 0; d < dirs.length; d++) {
							int dx = i + dirs[d][0];
							int dy = j + dirs[d][1];
							visited[dx][dy] = false;
						}
					}
				}
			}
		}
	}

	public static boolean visitedCheck(int x, int y) {
		boolean check = true;
		for (int i = 0; i < dirs.length; i++) {
			int dx = x + dirs[i][0];
			int dy = y + dirs[i][1];
			if (dx >= 0 && dx < N && dy >= 0 && dy < N) {
				if (visited[dx][dy]) {
					check = false;
					break;
				}
			} else {
				check = false;
				break;
			}
		}
		return check;
	}

}
