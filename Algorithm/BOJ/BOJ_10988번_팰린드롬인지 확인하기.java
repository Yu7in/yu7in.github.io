//BOJ_10988번_팰린드롬인지 확인하기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		boolean check = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				check = false;
				break;
			}
		}

		if (check) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
