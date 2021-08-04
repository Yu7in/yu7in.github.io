//BOJ_2231번_분해합

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		for (int i = 1; i < N; i++) {
			int num = i;
			int sum = num;
			while (num > 0) {
				sum = sum + num % 10;
				num = num / 10;
			}
			if (sum == N) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
