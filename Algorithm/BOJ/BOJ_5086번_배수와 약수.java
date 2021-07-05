//BOJ_5086번_배수와 약수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(tokens.nextToken());
			int B = Integer.parseInt(tokens.nextToken());

			if (A == 0 && B == 0)
				break;

			if (B % A == 0) {
				sb.append("factor").append("\n");
			} else if (A % B == 0) {
				sb.append("multiple").append("\n");
			} else {
				sb.append("neither").append("\n");
			}
		}

		System.out.println(sb);
	}
}
