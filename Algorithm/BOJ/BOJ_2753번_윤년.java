// BOJ_2753번_윤년

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ans = 0;
		int year = Integer.parseInt(br.readLine());
		if (year % 4 != 0) {
			ans = 0;
		} else if (year % 400 == 0) {
			ans = 1;
		} else if (year % 100 != 0) {
			ans = 1;
		} else {
			ans = 0;
		}

		System.out.println(ans);
	}
}
