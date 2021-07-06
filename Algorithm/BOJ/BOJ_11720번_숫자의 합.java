//BOJ_11720번_숫자의 합

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int sum = 0;
		for (int i = 0; i < N; i++) {
			int num = str.charAt(i) - '0';
			sum += num;
		}
		System.out.println(sum);
	}
}
