//BOJ_1312번_소수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(tokens.nextToken());
		int B = Integer.parseInt(tokens.nextToken());
		int N = Integer.parseInt(tokens.nextToken());

		int C = A % B;
		for (int i = 0; i < N - 1; i++) {
			C *= 10;
			C %= B;
		}
		C *= 10;

		System.out.println(C / B);
	}
}
