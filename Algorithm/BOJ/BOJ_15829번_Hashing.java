//BOJ_15829번_Hashing

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r = 31;
		int M = 1234567891;
		int L = Integer.parseInt(br.readLine());
		long ans = 0;
		String str = br.readLine();
		for (int i = 0; i < L; i++) {
			long num = str.charAt(i) - 'a' + 1;
			for (int j = 0; j < i; j++) {
				num = (num * r) % M;
			}
			ans = (ans + num) % M;
		}

		System.out.println(ans);
	}
}
