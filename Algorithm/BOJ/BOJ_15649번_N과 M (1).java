//BOJ_15649번_N과 M (1)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N, M;
	public static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		N = Integer.parseInt(tokens.nextToken());
		M = Integer.parseInt(tokens.nextToken());

		visited = new boolean[N + 1];
		backtracking(0, new int[M]);
	}

	public static void backtracking(int m, int[] arr) {
		if (m == M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = 1; i <= N; i++) {
				if (!visited[i]) {
					visited[i] = true;
					arr[m] = i;
					backtracking(m + 1, arr);
					visited[i] = false;
				}
			}
		}
	}
}