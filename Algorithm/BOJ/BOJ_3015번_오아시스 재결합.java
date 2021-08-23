//BOJ_3015번_오아시스 재결합

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long ans = 0;
		Stack<int[]> s = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			int cnt = 1;
			while (!s.isEmpty() && s.peek()[0] <= num) {
				int[] temp = s.pop();
				ans += temp[1];
				if (temp[0] == num) {
					cnt += temp[1];
				}
			}

			if (!s.isEmpty()) {
				ans++;
			}

			s.push(new int[] { num, cnt });
		}

		System.out.println(ans);
	}
}