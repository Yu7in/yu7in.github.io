//BOJ_10757번_큰 수 A+B

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		BigInteger big1 = new BigInteger(tokens.nextToken());
		BigInteger big2 = new BigInteger(tokens.nextToken());
		System.out.println(big1.add(big2));
	}
}
