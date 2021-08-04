//BOJ_1924번_2007년

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[] date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(tokens.nextToken());
		int y = Integer.parseInt(tokens.nextToken());

		int sum = 0;
		for (int i = 0; i < x - 1; i++) {
			sum += date[i];
		}

		sum += y;
		System.out.println(day[sum % 7]);
	}
}
