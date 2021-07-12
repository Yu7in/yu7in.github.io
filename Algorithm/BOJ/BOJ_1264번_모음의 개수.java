//BOJ_1264번_모음의 개수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = br.readLine();
			if (str.equals("#"))
				break;

			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				switch (str.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					cnt++;
					break;
				}
			}

			sb.append(cnt).append("\n");
		}

		System.out.println(sb);
	}
}
