//BOJ_3985번_롤 케이크

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L = Integer.parseInt(br.readLine());
		int[] arr = new int[L + 1];

		int max = 0;
		int predict = 0;
		int real = 0;
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int P = Integer.parseInt(tokens.nextToken());
			int K = Integer.parseInt(tokens.nextToken());
			for (int j = P; j <= K; j++) {
				if (arr[j] == 0)
					arr[j] = i;
			}
			if (max < (K - P + 1)) {
				max = K - P + 1;
				predict = i;
			}
		}

		int[] cnt = new int[N + 1];
		for (int i = 1; i <= L; i++) {
			if (arr[i] != 0)
				cnt[arr[i]]++;
		}

		max = 0;
		for (int i = 1; i <= N; i++) {
			if (max < cnt[i]) {
				max = cnt[i];
				real = i;
			}
		}

		System.out.println(predict);
		System.out.println(real);
	}
}
