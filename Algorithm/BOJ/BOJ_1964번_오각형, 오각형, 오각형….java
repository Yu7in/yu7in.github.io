//BOJ_1964번_오각형, 오각형, 오각형…

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int sum = 5;
		int next = 7;
		for (int i = 1; i < N; i++) {
			sum = (sum + next) % 45678;
			next = (next + 3) % 45678;
		}
		System.out.println(sum);
	}
}
