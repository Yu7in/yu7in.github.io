// BOJ_1920번_수 찾기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < N; i++) {
			hs.add(Integer.parseInt(tokens.nextToken()));
		}

		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[M];
		tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
		}

		for (int i = 0; i < M; i++) {
			if (hs.contains(arr[i])) {
				sb.append("1").append("\n");
			} else {
				sb.append("0").append("\n");
			}
		}

		System.out.println(sb);
	}
}
