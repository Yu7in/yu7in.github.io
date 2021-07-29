//BOJ_2884번_알람 시계

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());

		M -= 45;
		if (M < 0) {
			M += 60;
			if (H == 0) {
				H = 23;
			} else {
				H--;
			}
		}

		System.out.println(H + " " + M);
	}
}
