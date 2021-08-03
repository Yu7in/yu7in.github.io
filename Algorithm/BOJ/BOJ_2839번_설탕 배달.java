//BOJ_2839번_설탕 배달

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int five = N / 5;
		int three = 0;
		while (true) {
			int temp = N - five * 5;

			if (temp > N)
				break;

			if (temp % 3 == 0) {
				three = temp / 3;
				break;
			}

			five--;
		}
		System.out.println(five + three);
	}
}
