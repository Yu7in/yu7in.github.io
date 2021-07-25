//BOJ_2153번_소수 단어

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				sum += (str.charAt(i) - 'a' + 1);
			} else {
				sum += (str.charAt(i) - 'A' + 27);
			}
		}

		boolean check = true;
		for (int i = 2; i * i <= sum; i++) {
			if (sum % i == 0) {
				check = false;
				break;
			}
		}

		if (check) {
			System.out.println("It is a prime word.");
		} else {
			System.out.println("It is not a prime word.");
		}
	}
}
