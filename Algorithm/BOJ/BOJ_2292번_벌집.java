//BOJ_2292번_벌집

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 1;
		int cnt = 1;
		while (sum < N) {
			sum += (6 * cnt++);
		}
		System.out.println(cnt);
	}
}
