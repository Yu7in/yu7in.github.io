//BOJ_19949번_영재의 시험

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int ans;
	public static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		arr = new int[10];
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
		}

		ans = 0;
		findAns(0, 0, 0, new int[10]);
		
		System.out.println(ans);
	}

	public static void findAns(int n, int num, int cnt, int[] temp) {
		if (n == 10) {
			int score = 0;
			for (int i = 0; i < temp.length; i++) {
				if (arr[i] == temp[i]) {
					score++;
				}
			}
			if (score >= 5)
				ans++;
		} else {
			for (int i = 1; i <= 5; i++) {
				if (num == i && cnt == 2) {
					continue;
				} else {
					temp[n] = i;
					if (num == i) {
						findAns(n + 1, i, cnt + 1, temp);
					} else {
						findAns(n + 1, i, 1, temp);
					}
				}
			}
		}
	}
}