//BOJ_2493번_탑

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		Stack<int[]> s1 = new Stack<>();
		Stack<int[]> s2 = new Stack<>();

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			s1.push(new int[] { i, Integer.parseInt(tokens.nextToken()) });
		}

		int[] ans = new int[N];
		while (!s1.isEmpty()) {
			if (s2.isEmpty()) {
				s2.add(s1.pop());
			} else {
				int[] num = s1.peek();
				while (!s2.isEmpty()) {
					if (num[1] > s2.peek()[1]) {
						ans[s2.pop()[0]] = num[0] + 1;
					} else {
						s2.push(s1.pop());
						break;
					}
				}
			}
		}

		while (!s2.isEmpty()) {
			ans[s2.pop()[0]] = 0;
		}

		for (int i = 0; i < N; i++) {
			sb.append(ans[i]).append(" ");
		}
		System.out.println(sb);
	}
}