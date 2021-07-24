//BOJ_1225번_이상한 곱셈

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		
		String A = tokens.nextToken();
		String B = tokens.nextToken();

		long sum = 0;
		for (int i = 0; i < A.length(); i++) {
			for (int j = 0; j < B.length(); j++) {
				sum += ((A.charAt(i) - '0') * (B.charAt(j) - '0'));
			}
		}

		System.out.println(sum);
	}
}
