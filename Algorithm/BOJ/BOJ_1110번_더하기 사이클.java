//BOJ_1110번_더하기 사이클

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int cnt = 0;
		int newNum = N;
		while (true) {
			int n = newNum;
			int sum = 0;
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}

			int rightN = newNum % 10;
			int rightSum = sum % 10;

			newNum = rightN * 10 + rightSum;
			cnt++;

			if (newNum == N)
				break;
		}

		System.out.println(cnt);
	}
}
