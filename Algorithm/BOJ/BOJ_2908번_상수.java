//BOJ_2908번_상수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder(tokens.nextToken());
		String A = sb.reverse().toString();

		sb = new StringBuilder(tokens.nextToken());
		String B = sb.reverse().toString();

		if (A.compareTo(B) > 0) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}
	}
}
