//BOJ_11721번_열 개씩 끊어 출력하기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int idx = 0;
		String str = br.readLine();
		while (true) {
			if (idx + 10 > str.length()) {
				sb.append(str.substring(idx)).append("\n");
				break;
			} else {
				sb.append(str.substring(idx, idx + 10)).append("\n");
				idx += 10;
			}
		}
		System.out.println(sb);
	}
}
