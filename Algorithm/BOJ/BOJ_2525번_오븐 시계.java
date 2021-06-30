// BOJ_2525번_오븐 시계

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(tokens.nextToken());
		int B = Integer.parseInt(tokens.nextToken());
		int C = Integer.parseInt(br.readLine());

		B += C;
		if (B >= 60) {
			A += B / 60;
			B %= 60;
			if (A > 23) {
				A -= 24;
			}
		}

		System.out.println(A + " " + B);
	}
}
