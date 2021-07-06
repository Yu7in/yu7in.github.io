//BOJ_2446번_별 찍기 - 9

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int star = 2 * N - 1;
		int idx = 0;
		while (star > 1) {
			for (int i = 0; i < idx; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}
			System.out.println();
			idx++;
			star -= 2;
		}
		while (star <= 2 * N - 1) {
			for (int i = 0; i < idx; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}
			System.out.println();
			idx--;
			star += 2;
		}
	}
}
