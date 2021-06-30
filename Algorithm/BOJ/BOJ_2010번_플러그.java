// BOJ_2010번_플러그

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			sum += (Integer.parseInt(br.readLine()) - 1);
		}

		sum++;
		System.out.println(sum);
	}
}
