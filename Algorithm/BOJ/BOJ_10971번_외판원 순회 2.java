//BOJ_10971번_외판원 순회 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N, minNum;
	public static int[][] arr;
	public static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(tokens.nextToken());
			}
		}

		minNum = Integer.MAX_VALUE;
		visited = new boolean[N];
		visited[0] = true;
		findAns(1, 0, 0);

		System.out.println(minNum);
	}

	public static void findAns(int n, int idx, int sum) {
		if (n == N) {
			if (arr[idx][0] != 0) {
				sum += arr[idx][0];
				minNum = minNum > sum ? sum : minNum;
			}
		} else {
			for (int i = 0; i < N; i++) {
				if (arr[idx][i] != 0 && !visited[i]) {
					visited[i] = true;
					findAns(n + 1, i, sum + arr[idx][i]);
					visited[i] = false;
				}
			}
		}
	}
}