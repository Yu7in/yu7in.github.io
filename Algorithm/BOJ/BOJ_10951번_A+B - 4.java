//BOJ_10951번_A+B - 4

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = "";
		while ((str = br.readLine()) != null) {
			StringTokenizer tokens = new StringTokenizer(str);
			int A = Integer.parseInt(tokens.nextToken());
			int B = Integer.parseInt(tokens.nextToken());
			sb.append(A + B).append("\n");
		}

		System.out.println(sb);
	}
}
