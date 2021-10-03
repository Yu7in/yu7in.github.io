//BOJ_2580번_스도쿠

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static boolean find;
	public static int[][] arr;
	public static ArrayList<int[]> xy;
	public static int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public static int[][] circle = { { 0, 0 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 },
			{ 1, -1 }, { 0, -1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		arr = new int[9][9];
		xy = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(tokens.nextToken());
				if (arr[i][j] == 0) {
					xy.add(new int[] { i, j });
				}
			}
		}

		find = false;
		findAns(0);
	}

	public static void findAns(int n) {
		if (n == xy.size()) {
			find = true;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]);
					if (j != arr.length - 1)
						System.out.print(" ");
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				boolean check = true;
				for (int j = 0; j < dirs.length; j++) {
					int cnt = 1;
					while (true) {
						int dx = xy.get(n)[0] + dirs[j][0] * cnt;
						int dy = xy.get(n)[1] + dirs[j][1] * cnt;
						if (dx >= 0 && dy >= 0 && dx < 9 && dy < 9) {
							if (arr[dx][dy] == i) {
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
					int x = 0;
					int y = 0;
					if (xy.get(n)[0] >= 0 && xy.get(n)[0] <= 2) {
						x = 1;
					} else if (xy.get(n)[0] >= 3 && xy.get(n)[0] <= 5) {
						x = 4;
					} else {
						x = 7;
					}
					if (xy.get(n)[1] >= 0 && xy.get(n)[1] <= 2) {
						y = 1;
					} else if (xy.get(n)[1] >= 3 && xy.get(n)[1] <= 5) {
						y = 4;
					} else {
						y = 7;
					}

					for (int j = 0; j < circle.length; j++) {
						int dx = x + circle[j][0];
						int dy = y + circle[j][1];
						if (dx >= 0 && dy >= 0 && dx < 9 && dy < 9) {
							if (arr[dx][dy] == i) {
								check = false;
								break;
							}
						}
					}
				}

				if (check) {
					arr[xy.get(n)[0]][xy.get(n)[1]] = i;
					findAns(n + 1);
					arr[xy.get(n)[0]][xy.get(n)[1]] = 0;
					if (find)
						return;
				}
			}
		}
	}
}