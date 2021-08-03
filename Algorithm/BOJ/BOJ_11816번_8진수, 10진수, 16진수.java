//BOJ_11816번_8진수, 10진수, 16진수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = br.readLine();
		if (X.substring(0, 2).equals("0x")) {
			System.out.println(Integer.parseInt(X.substring(2), 16));
		} else if (X.substring(0, 1).equals("0")) {
			System.out.println(Integer.parseInt(X.substring(1), 8));
		} else {
			System.out.println(X);
		}
	}
}
