//BOJ_1157번_단어 공부

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		str = str.toUpperCase();

		int[] arr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'A']++;
		}

		int cnt = 0;
		int idx = 0;
		int maxNum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				cnt = 1;
				idx = i;
				maxNum = arr[i];
			} else if (maxNum == arr[i]) {
				cnt++;
			}
		}

		char ans = 'A';
		if (cnt == 1) {
			ans += idx;
		} else {
			ans = '?';
		}
		System.out.println(ans);
	}
}
