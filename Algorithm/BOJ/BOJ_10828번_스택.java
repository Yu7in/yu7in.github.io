//BOJ_10828번_스택

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Stack<Integer> s = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			String str = tokens.nextToken();
			if (str.equals("push")) {
				s.push(Integer.parseInt(tokens.nextToken()));
			} else if (str.equals("pop")) {
				if (s.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(s.pop()).append("\n");
			} else if (str.equals("size")) {
				sb.append(s.size()).append("\n");
			} else if (str.equals("empty")) {
				if (s.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
			} else if (str.equals("top")) {
				if (s.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(s.peek()).append("\n");
			}
		}
		System.out.println(sb);
	}
}
