//BOJ_15652번_N과 M (4)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N, M;
	public static StringBuilder sb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		N = Integer.parseInt(tokens.nextToken());
		M = Integer.parseInt(tokens.nextToken());

		sb = new StringBuilder();
		backtracking4(0, 1, new int[M]);

		System.out.println(sb);
	}

	public static void backtracking4(int m, int idx, int[] arr) {
		if (m == M) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
		} else {
			for (int i = idx; i <= N; i++) {
				arr[m] = i;
				backtracking4(m + 1, i, arr);
			}
		}
	}
}