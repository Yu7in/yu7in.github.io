//BOJ_1158번_요세푸스 문제

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		int K = Integer.parseInt(tokens.nextToken());

		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}

		int cnt = 0;
		Queue<Integer> ans = new LinkedList<>();
		while (!q.isEmpty()) {
			cnt++;
			if (cnt == K) {
				ans.add(q.poll());
				cnt = 0;
			} else {
				int num = q.poll();
				q.add(num);
			}
		}

		sb.append("<");
		while (!ans.isEmpty()) {
			sb.append(ans.poll());
			if (!ans.isEmpty()) {
				sb.append(", ");
			}
		}
		sb.append(">");

		System.out.println(sb);
	}
}