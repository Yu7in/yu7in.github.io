// BOJ_10797번_10부제

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int date = Integer.parseInt(br.readLine());

		int cnt = 0;
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		while (tokens.hasMoreTokens()) {
			int car = Integer.parseInt(tokens.nextToken());
			if (car % 10 == date)
				cnt++;
		}

		System.out.println(cnt);
	}
}
