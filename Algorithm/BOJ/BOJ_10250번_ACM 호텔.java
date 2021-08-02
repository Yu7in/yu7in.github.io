//BOJ_10250번_ACM 호텔

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(tokens.nextToken());
			int W = Integer.parseInt(tokens.nextToken());
			int N = Integer.parseInt(tokens.nextToken());

			int X = N % H == 0 ? N / H : N / H + 1;
			int Y = N % H == 0 ? H : N % H;
			sb.append(Y * 100 + X).append("\n");
		}
		System.out.println(sb);
	}
}
