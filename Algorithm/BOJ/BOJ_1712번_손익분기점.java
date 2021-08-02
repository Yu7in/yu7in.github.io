//BOJ_1712번_손익분기점

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		long A = Long.parseLong(tokens.nextToken());
		long B = Long.parseLong(tokens.nextToken());
		long C = Long.parseLong(tokens.nextToken());

		if (B >= C) {
			System.out.println(-1);
		} else {
			System.out.println(A / (C - B) + 1);
		}
	}
}
