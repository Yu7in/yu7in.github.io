//BOJ_1009번_분산처리

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tokens.nextToken());
			int b = Integer.parseInt(tokens.nextToken());

			int ans = 1;
			for (int i = 0; i < b; i++)
				ans = ((ans % 10) * (a % 10)) % 10;
			
			if (ans == 0)
				ans = 10;
			sb.append(ans).append("\n");
		}
		System.out.println(sb);
	}
}
