//BOJ_2675번_문자열 반복

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
			int R = Integer.parseInt(tokens.nextToken());
			String str = tokens.nextToken();
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < R; k++) {
					sb.append(str.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
