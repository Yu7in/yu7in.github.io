//BOJ_10872번_팩토리얼

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ans = 1;
		while (N > 0) {
			ans *= N;
			N--;
		}
		System.out.println(ans);
	}
}
