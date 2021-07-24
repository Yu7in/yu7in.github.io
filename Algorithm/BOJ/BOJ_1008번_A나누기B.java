//BOJ_1008번_A/B

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		double A = Double.parseDouble(tokens.nextToken());
		double B = Double.parseDouble(tokens.nextToken());

		double ans = A / B;
		System.out.println(ans);
	}
}
