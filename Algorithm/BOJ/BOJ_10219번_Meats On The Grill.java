//BOJ_10219번_Meats On The Grill

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int H, W;
	public static char[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			H = Integer.parseInt(tokens.nextToken());
			W = Integer.parseInt(tokens.nextToken());

			arr = new char[H][W];
			for (int i = 0; i < H; i++) {
				arr[i] = br.readLine().toCharArray();
			}

			for (int i = 0; i < H; i++) {
				for (int j = W - 1; j >= 0; j--) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
