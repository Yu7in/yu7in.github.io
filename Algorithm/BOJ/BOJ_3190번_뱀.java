//BOJ_3190번_뱀

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N + 1][N + 1];

		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(tokens.nextToken());
			int y = Integer.parseInt(tokens.nextToken());
			arr[x][y] = 1;
		}

		int cnt = 0;
		int dir = 0;
		int x = 1;
		int y = 1;
		boolean check = false;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { 1, 1 });
		arr[1][1] = 2;

		int L = Integer.parseInt(br.readLine());
		for (int i = 0; i < L; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(tokens.nextToken());
			char C = tokens.nextToken().charAt(0);

			while (X != cnt) {
				cnt++;
				x = x + dirs[dir][0];
				y = y + dirs[dir][1];
				if (x >= 1 && y >= 1 && x <= N && y <= N) {
					q.add(new int[] { x, y });
					if (arr[x][y] == 0) {
						int[] temp = q.poll();
						arr[temp[0]][temp[1]] = 0;
					} else if(arr[x][y]==2) {
						check = true;
						break;
					}
					arr[x][y] = 2;
				} else {
					check = true;
					break;
				}
			}

			if (check)
				break;

			if (C == 'D') {
				dir++;
				if (dir > 3)
					dir = 0;
			} else if (C == 'L') {
				dir--;
				if (dir < 0)
					dir = 3;
			}
		}

		while (!check) {
			cnt++;
			x = x + dirs[dir][0];
			y = y + dirs[dir][1];
			if (x >= 1 && y >= 1 && x <= N && y <= N) {
				q.add(new int[] { x, y });
				if (arr[x][y] == 0) {
					int[] temp = q.poll();
					arr[temp[0]][temp[1]] = 0;
				} else if (arr[x][y] == 1) {
					arr[x][y] = 2;
				} else {
					check = true;
				}
			} else {
				check = true;
			}
		}

		System.out.println(cnt);
	}
}