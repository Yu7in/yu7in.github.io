//BOJ_1002번_터렛

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(tokens.nextToken());
			int y1 = Integer.parseInt(tokens.nextToken());
			int r1 = Integer.parseInt(tokens.nextToken());
			int x2 = Integer.parseInt(tokens.nextToken());
			int y2 = Integer.parseInt(tokens.nextToken());
			int r2 = Integer.parseInt(tokens.nextToken());

			double num = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			if (num == 0 && r1 == r2) {
				sb.append(-1).append("\n");
			} else if (num == 0 && r1 != r2) {
				sb.append(0).append("\n");
			} else if (num > r1 + r2) {
				sb.append(0).append("\n");
			} else if (num == r1 + r2 || num == Math.abs(r1 - r2)) {
				sb.append(1).append("\n");
			} else if (num < Math.abs(r1 - r2)) {
				sb.append(0).append("\n");
			} else {
				sb.append(2).append("\n");
			}
		}
		System.out.println(sb);
	}
}
