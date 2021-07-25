//BOJ_14696번_딱지놀이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int[] arr = new int[5];
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			tokens.nextToken();
			while (tokens.hasMoreTokens()) {
				int num = Integer.parseInt(tokens.nextToken());
				if (num <= 4) {
					arr[num]++;
				}
			}

			int[] brr = new int[5];
			tokens = new StringTokenizer(br.readLine());
			tokens.nextToken();
			while (tokens.hasMoreTokens()) {
				int num = Integer.parseInt(tokens.nextToken());
				if (num <= 4) {
					brr[num]++;
				}
			}

			char ans = 'D';
			for (int j = 4; j >= 0; j--) {
				if (arr[j] > brr[j]) {
					ans = 'A';
					break;
				} else if (arr[j] < brr[j]) {
					ans = 'B';
					break;
				}
			}

			sb.append(ans).append("\n");
		}

		System.out.println(sb);
	}
}
