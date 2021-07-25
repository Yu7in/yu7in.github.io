//BOJ_9455번_박스

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(tokens.nextToken());
			int n = Integer.parseInt(tokens.nextToken());

			int[][] arr = new int[m][n];
			for (int j = 0; j < m; j++) {
				tokens = new StringTokenizer(br.readLine());
				for (int k = 0; k < n; k++) {
					arr[j][k] = Integer.parseInt(tokens.nextToken());
				}
			}

			int sum = 0;
			for (int col = 0; col < n; col++) {
				for (int row = 0; row < m - 1; row++) {
					if (arr[row][col] == 1) {
						int cnt = 0;
						for (int j = row; j < m; j++) {
							if (arr[j][col] == 0)
								cnt++;
						}
						sum += cnt;
					}
				}
			}
			sb.append(sum).append("\n");
		}

		System.out.println(sb);
	}
}
