// BOJ_5543번_상근날드

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] burger = new int[3];
		for (int i = 0; i < burger.length; i++) {
			burger[i] = Integer.parseInt(br.readLine());
		}

		int[] drink = new int[2];
		for (int i = 0; i < drink.length; i++) {
			drink[i] = Integer.parseInt(br.readLine());
		}

		int minNum = Integer.MAX_VALUE;
		for (int i = 0; i < burger.length; i++) {
			for (int j = 0; j < drink.length; j++) {
				int num = burger[i] + drink[j] - 50;
				minNum = minNum > num ? num : minNum;
			}
		}
		
		System.out.println(minNum);
	}
}
