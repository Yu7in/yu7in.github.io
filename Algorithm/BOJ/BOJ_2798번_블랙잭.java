//BOJ_2798번_블랙잭

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());

		int[] arr = new int[N];
		tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
		}

		int ans = 0;
		Arrays.sort(arr);
		for (int i = 0; i < N - 2; i++) {
			if (arr[i] >= M)
				break;
			for (int j = i + 1; j < N - 1; j++) {
				if (arr[i] + arr[j] >= M)
					break;
				for (int k = j + 1; k < N; k++) {
					if (arr[i] + arr[j] + arr[k] <= M) {
						ans = ans < arr[i] + arr[j] + arr[k] ? arr[i] + arr[j] + arr[k] : ans;
					} else {
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
