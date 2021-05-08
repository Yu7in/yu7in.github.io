// BOJ_2805번_나무 자르기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		long M = Long.parseLong(tokens.nextToken());

		long max = 0;
		long[] tree = new long[N];
		tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			tree[i] = Long.parseLong(tokens.nextToken());
			max = max < tree[i] ? tree[i] : max;
		}

		long min = 1;
		while (min <= max) {
			long mid = (min + max) / 2;

			long sum = 0;
			for (int i = 0; i < N; i++) {
				if (tree[i] > mid) {
					sum += (tree[i] - mid);
				}
			}

			if (sum >= M) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}

		System.out.println(max);
	}
}
