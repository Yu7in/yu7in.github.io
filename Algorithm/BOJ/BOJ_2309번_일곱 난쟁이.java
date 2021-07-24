//BOJ_2309번_일곱 난쟁이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static boolean check = false;
	public static int[] arr;
	public static int[] fake = new int[2];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		findSeven(0, 0, 0);

		for (int i = 0; i < arr.length; i++) {
			check = false;
			for (int j = 0; j < fake.length; j++) {
				if (fake[j] == i) {
					check = true;
					break;
				}
			}
			if (!check) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void findSeven(int idx, int cnt, int sum) {
		if (idx == 9) {
			if (sum == 100) {
				check = true;
				return;
			}
		} else {
			if (cnt != 2) {
				fake[cnt] = idx;
				findSeven(idx + 1, cnt + 1, sum);
				if (check)
					return;
			}
			findSeven(idx + 1, cnt, sum + arr[idx]);
			if (check)
				return;
		}
	}
}
