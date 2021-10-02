//BOJ_16987번_계란으로 계란치기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int N, maxNum;
	public static int[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(tokens.nextToken());
			arr[i][1] = Integer.parseInt(tokens.nextToken());
		}

		maxNum = 0;
		findAns(0);

		System.out.println(maxNum);
	}

	public static void findAns(int n) {
		if (n == N) {
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (arr[i][0] <= 0)
					cnt++;
			}
			maxNum = maxNum < cnt ? cnt : maxNum;
		} else {
			if (arr[n][0] > 0) {
				boolean check = false;
				for (int i = 0; i < N; i++) {
					if (i != n && arr[i][0] > 0) {
						check = true;
						arr[i][0] -= arr[n][1];
						arr[n][0] -= arr[i][1];
						findAns(n + 1);
						arr[i][0] += arr[n][1];
						arr[n][0] += arr[i][1];
					}
				}
				if(!check) {
					findAns(n + 1);
				}
			} else {
				findAns(n + 1);
			}
		}
	}
}