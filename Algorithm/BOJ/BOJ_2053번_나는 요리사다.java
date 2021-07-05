//BOJ_2053번_나는 요리사다

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int idx = 0;
		int maxNum = 0;
		int[] arr = new int[6];
		for (int i = 1; i <= 5; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			while (tokens.hasMoreTokens()) {
				arr[i] += Integer.parseInt(tokens.nextToken());
			}
			if (arr[i] > maxNum) {
				maxNum = arr[i];
				idx = i;
			}
		}

		System.out.println(idx + " " + maxNum);
	}
}
