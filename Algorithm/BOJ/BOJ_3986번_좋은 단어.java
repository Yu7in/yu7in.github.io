//BOJ_3986번_좋은 단어

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			Stack<Character> s = new Stack<>();
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				if (s.isEmpty()) {
					s.push(str.charAt(j));
				} else {
					if (s.peek() == str.charAt(j)) {
						s.pop();
					} else {
						s.add(str.charAt(j));
					}
				}
			}

			if (s.isEmpty())
				cnt++;
		}
		System.out.println(cnt);
	}
}
