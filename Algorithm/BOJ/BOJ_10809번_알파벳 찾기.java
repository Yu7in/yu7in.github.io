//BOJ_10809번_알파벳 찾기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			char ch = 'a';
			ch += i;
			System.out.print(str.indexOf(ch) + " ");
		}
	}
}
