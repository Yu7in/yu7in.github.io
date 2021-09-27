//BOJ_18429번_근손실

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N, K, ans;
	public static int[] arr;
	public static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		N = Integer.parseInt(tokens.nextToken());
		K = Integer.parseInt(tokens.nextToken());

		arr = new int[N];
		tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
		}

		ans = 0;
		visited = new boolean[N];
		findAns(0, 500);
		
		System.out.println(ans);
	}

	public static void findAns(int n, int weight) {
		if (n == N) {
			ans++;
		} else {
			for (int i = 0; i < N; i++) {
				if (!visited[i]) {
					int temp = weight + arr[i] - K;
					if (weight >= 500) {
						visited[i] = true;
						findAns(n + 1, temp);
						visited[i] = false;
					}
				}
			}
		}
	}
}