//BOJ_1075번_나누기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());

		N = N - N % 100;
		int num = N / F;
		int ans = 0;
		if (N % F == 0) {
			ans = N;
		} else {
			ans = num * F + F;
		}

		int a = ans % 10;
		ans /= 10;
		int b = ans % 10;
		System.out.println(b + "" + a);
	}
}
