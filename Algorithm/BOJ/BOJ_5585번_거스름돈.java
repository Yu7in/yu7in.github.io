//BOJ_5585번_거스름돈

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] money = { 500, 100, 50, 10, 5, 1 };
		N = 1000 - N;
		int ans = 0;
		for (int i = 0; i < money.length; i++) {
			ans += (N / money[i]);
			N = N - (N / money[i]) * money[i];
			if (N == 0)
				break;
		}
		System.out.println(ans);
	}
}
