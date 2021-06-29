// BOJ_2588번_곱셈

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		int ans = 0;
		int position = 1;
		while (B > 0) {
			int n = B % 10;
			B /= 10;

			sb.append(A * n).append("\n");
			ans += A * n * position;
			position *= 10;
		}
		sb.append(ans);
		System.out.println(sb);
	}
}
