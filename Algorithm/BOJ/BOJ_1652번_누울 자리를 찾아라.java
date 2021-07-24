//BOJ_1652번_누울 자리를 찾아라

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		char[][] arr = new char[N][N];
		for (int i = 0; i < arr.length; i++) {
			String str = br.readLine();
			arr[i] = str.toCharArray();
		}

		int row = 0;
		int col = 0;
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 'X') {
					if (cnt >= 2)
						row++;
					cnt = 0;
				} else {
					cnt++;
				}
			}
			if (cnt >= 2)
				row++;

			cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] == 'X') {
					if (cnt >= 2)
						col++;
					cnt = 0;
				} else {
					cnt++;
				}
			}
			if (cnt >= 2)
				col++;
		}
		System.out.println(row + " " + col);
	}
}
