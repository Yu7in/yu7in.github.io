//BOJ_1193번_분수찾기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int num = 1;
		while (X > num) {
			X -= num;
			num++;
		}
		num++;
		if (num % 2 != 0) {
			System.out.println(X + "/" + (num - X));
		} else {
			System.out.println((num - X) + "/" + X);
		}
	}
}
