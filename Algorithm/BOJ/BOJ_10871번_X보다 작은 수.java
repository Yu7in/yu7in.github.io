// BOJ_10871번_X보다 작은 수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(tokens.nextToken());
		int X = Integer.parseInt(tokens.nextToken());

		tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(tokens.nextToken());
			if (X > n)
				sb.append(n).append(" ");
		}

		System.out.println(sb);
	}
}
