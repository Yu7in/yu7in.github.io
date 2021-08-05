//BOJ_2960번_에라토스테네스의 체

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(tokens.nextToken());
		int K = Integer.parseInt(tokens.nextToken());

		int cnt = 0;
		int ans = 0;
		boolean[] checked = new boolean[N + 1];
		for (int i = 2; i < checked.length; i++) {
			if (checked[i]) {
				continue;
			} else {
				int num = i;
				while (num <= N) {
					if (!checked[num]) {
						checked[num] = true;
						cnt++;
						if (cnt == K) {
							ans = num;
							break;
						}
					}
					num += i;
				}
				if (cnt == K)
					break;
			}
		}
		System.out.println(ans);
	}
}
