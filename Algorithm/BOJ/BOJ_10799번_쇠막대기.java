//BOJ_10799번_쇠막대기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		boolean check = false;
		Stack<Character> s = new Stack<>();
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(') {
				s.push(ch);
				check = true;
			} else {
				s.pop();
				if (check)
					cnt += s.size();
				else
					cnt++;
				check = false;
			}
		}

		System.out.println(cnt);
	}
}
