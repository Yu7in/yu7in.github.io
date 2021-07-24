//BOJ_10163번_색종이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] arr = new int[1001][1001];
		int N = Integer.parseInt(br.readLine());
		int[] cnt = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(tokens.nextToken());
			int y = Integer.parseInt(tokens.nextToken());
			int width = Integer.parseInt(tokens.nextToken());
			int height = Integer.parseInt(tokens.nextToken());

			cnt[i] = width * height;
			for (int j = 0; j < height; j++) {
				for (int k = 0; k < width; k++) {
					if (arr[x + k][y + j] != 0) {
						cnt[arr[x + k][y + j]]--;
					}
					arr[x + k][y + j] = i;
				}
			}
		}

		for (int i = 1; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}
