// BOJ_13277번_큰 수 곱셈

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(tokens.nextToken());
		BigInteger B = new BigInteger(tokens.nextToken());
		System.out.println(A.multiply(B));
	}
}
