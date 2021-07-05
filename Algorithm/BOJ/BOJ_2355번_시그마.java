//BOJ_2355번_시그마

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		long A = Long.parseLong(tokens.nextToken());
		long B = Long.parseLong(tokens.nextToken());

		if (A > B) {
			long temp = A;
			A = B;
			B = temp;
		}
		
		long ans = (A + B) * (B - A + 1) / 2;
		System.out.println(ans);
	}
}
