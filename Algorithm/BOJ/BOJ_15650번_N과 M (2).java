//BOJ_15650번_N과 M (2)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N, M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		N = Integer.parseInt(tokens.nextToken());
		M = Integer.parseInt(tokens.nextToken());

		backtracking2(0, 1, new int[M]);
	}

	public static void backtracking2(int m, int idx, int[] arr) {
		if (m == M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = idx; i <= N; i++) {
				arr[m] = i;
				backtracking2(m + 1, i + 1, arr);
			}
		}
	}
}