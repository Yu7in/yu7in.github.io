//BOJ_15651번_N과 M (3)

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
		backtracking3(0, new int[M]);
		System.out.println(sb);
	}

	public static void backtracking3(int m, int[] arr) {
		if (m == M) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
		} else {
			for (int i = 1; i <= N; i++) {
				arr[m] = i;
				backtracking3(m + 1, arr);
			}
		}
	}
}