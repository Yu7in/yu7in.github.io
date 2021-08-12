//BOJ_1918번_후위 표기식

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '+' || ch == '-') {
				if (!s.isEmpty() && s.peek() != '(') {
					sb.append(s.pop());
				}
				s.push(ch);
			} else if (ch == '*' || ch == '/') {
				if (!s.isEmpty() && s.peek() != '(' && s.peek() != '+' && s.peek() != '-') {
					sb.append(s.pop());
				}
				s.push(ch);
			} else if (ch == '(') {
				s.push(ch);
			} else if (ch == ')') {
				while (!s.isEmpty()) {
					if (s.peek() == '(') {
						s.pop();
						break;
					} else {
						sb.append(s.pop());
					}
				}
			} else {
				if (i == str.length() - 1) {
					sb.append(ch);
					while (!s.isEmpty()) {
						sb.append(s.pop());
					}
				} else {
					if (!s.isEmpty() && s.peek() != '(') {
						char temp = s.peek();
						if (temp == '*' || temp == '/') {
							sb.append(ch).append(s.pop());
						} else {
							if (str.charAt(i + 1) == '*' || str.charAt(i + 1) == '/') {
								sb.append(ch);
							} else {
								sb.append(ch).append(s.pop());
							}
						}
					} else {
						sb.append(ch);
					}
				}
			}
		}

		while (!s.isEmpty()) {
			sb.append(s.pop());
		}

		System.out.println(sb);
	}
}
