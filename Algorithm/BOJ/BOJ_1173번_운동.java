//BOJ_1173번_운동

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());
		int T = Integer.parseInt(tokens.nextToken());
		int R = Integer.parseInt(tokens.nextToken());

		int n = 0;
		int cnt = 0;
		int now = m;

		if (m + T > M) {
			System.out.println(-1);
		} else {
			while (true) {
				if (n == N)
					break;
				cnt++;

				if (now + T <= M) {
					now += T;
					n++;
				} else {
					if (now - R >= m) {
						now -= R;
					} else {
						now = m;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
