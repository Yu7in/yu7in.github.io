// BOJ_2562번_최댓값

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[9];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		int maxNum = 0;
		int idx = 0;
		for (int i = 0; i < num.length; i++) {
			if (maxNum < num[i]) {
				maxNum = num[i];
				idx = i + 1;
			}
		}
		
		System.out.println(maxNum);
		System.out.println(idx);
	}
}
