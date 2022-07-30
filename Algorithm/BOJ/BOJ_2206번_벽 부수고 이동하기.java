import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int N, M, ans;
	public static int[][] arr;
	public static int[][][] checked;
	public static int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static class Loc {
		int x; // x 좌표
		int y; // y 좌표 
		int cnt; // 이동횟수 
		boolean destroyed; // 벽파괴여부 

		public Loc(int x, int y, int cnt, boolean destroyed) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			this.destroyed = destroyed;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		N = Integer.parseInt(tokens.nextToken());
		M = Integer.parseInt(tokens.nextToken());

		arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}

		checked = new int[N][M][2]; // 0: 벽을 부시지 않고 이동했을 때, 1: 벽 하나 부시고 이동했을 때 
		Queue<Loc> q = new LinkedList<>();
		q.add(new Loc(0, 0, 1, false));
		checked[0][0][0] = 1;
		checked[0][0][1] = 1;
		while (!q.isEmpty()) {
			Loc loc = q.poll();
			for (int d = 0; d < dirs.length; d++) {
				int dx = loc.x + dirs[d][0];
				int dy = loc.y + dirs[d][1];
				if (dx >= 0 && dy >= 0 && dx < N && dy < M) {
					if (arr[dx][dy] == 1 && !loc.destroyed) { // 아직 벽을 부시지 않았으면(!loc.destroyed) 벽 하나 지나기 가능 
						if (checked[dx][dy][1] > loc.cnt + 1 || checked[dx][dy][1] == 0) {
							checked[dx][dy][1] = loc.cnt + 1;
							q.add(new Loc(dx, dy, checked[dx][dy][1], true));
						}
					} else if (arr[dx][dy] == 0) {
						if (loc.destroyed && (checked[dx][dy][1] > loc.cnt + 1 || checked[dx][dy][1] == 0)) { // 이미 벽을 부셨을 때 cnt
							checked[dx][dy][1] = loc.cnt + 1;
							q.add(new Loc(dx, dy, checked[dx][dy][1], true));
						} else if (!loc.destroyed && (checked[dx][dy][0] > loc.cnt + 1 || checked[dx][dy][0] == 0)) { // 벽을 부시지 않았을 때 cnt
							checked[dx][dy][0] = loc.cnt + 1;
							q.add(new Loc(dx, dy, checked[dx][dy][0], false));
						}
					}
				}
			}
		}

		ans = -1;
		if (checked[N - 1][M - 1][0] != 0) {
			ans = checked[N - 1][M - 1][0];
		}
		if (checked[N - 1][M - 1][1] != 0) {
			if(ans == -1)
				ans = checked[N - 1][M - 1][1];
			else
				ans = ans < checked[N - 1][M - 1][1] ? ans : checked[N - 1][M - 1][1];
		}

		System.out.println(ans);
	}

}