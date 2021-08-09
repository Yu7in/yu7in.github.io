//BOJ_1874번_스택 수열

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = 1;
		boolean check = true;
		Stack<Integer> s = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (check) {
				while (num <= temp) {
					sb.append("+").append("\n");
					s.push(num++);
				}
				if (s.peek() == temp) {
					sb.append("-").append("\n");
					s.pop();
				} else {
					sb = new StringBuilder();
					sb.append("NO").append("\n");
					check = false;
				}
			}
		}
		System.out.println(sb);
	}
}
