//BOJ_9610번_사분면

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[5];
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(tokens.nextToken());
			int y = Integer.parseInt(tokens.nextToken());
			if (x == 0 || y == 0) {
				arr[0]++;
			} else if (x > 0 && y > 0) {
				arr[1]++;
			} else if (x < 0 && y > 0) {
				arr[2]++;
			} else if (x < 0 && y < 0) {
				arr[3]++;
			} else if (x > 0 && y < 0) {
				arr[4]++;
			}
		}

		for (int i = 1; i < 5; i++) {
			System.out.printf("Q%d: %d\n", i, arr[i]);
		}
		System.out.printf("AXIS: %d", arr[0]);
	}
}
