//BOJ_1497번_기타콘서트

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N, M, ans, maxNum;
	public static char[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		N = Integer.parseInt(tokens.nextToken());
		M = Integer.parseInt(tokens.nextToken());

		arr = new char[N][M];
		for (int i = 0; i < N; i++) {
			tokens = new StringTokenizer(br.readLine());
			tokens.nextToken();
			arr[i] = tokens.nextToken().toCharArray();
		}

		ans = -1;
		maxNum = 0;
		for (int i = 1; i <= N; i++) {
			findAns(0, i, 0, new int[i]);
		}

		System.out.println(ans);
	}

	public static void findAns(int n, int m, int idx, int[] temp) {
		if (n == m) {
			boolean[] visited = new boolean[M];
			for (int i = 0; i < temp.length; i++) {
				for (int j = 0; j < M; j++) {
					if (arr[temp[i]][j] == 'Y') {
						visited[j] = true;
					}
				}
			}

			int cnt = 0;
			for (int i = 0; i < visited.length; i++) {
				if (visited[i])
					cnt++;
			}

			if (maxNum < cnt) {
				maxNum = cnt;
				ans = m;
			}
		} else {
			for (int i = idx; i < N; i++) {
				temp[n] = i;
				findAns(n + 1, m, i + 1, temp);
			}
		}
	}
}