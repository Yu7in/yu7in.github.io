//BOJ_4344번_평균은 넘겠지

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int C = Integer.parseInt(br.readLine());
		for (int i = 0; i < C; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(tokens.nextToken());

			double sum = 0;
			int[] arr = new int[N];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(tokens.nextToken());
				sum += arr[j];
			}

			double avg = sum / N;
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > avg)
					cnt++;
			}

			double per = (double) cnt / N * 100;
			System.out.printf("%.3f%%\n", per);
		}
	}
}
