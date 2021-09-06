//BOJ_1021번_회전하는 큐

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<Integer>();

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}

		int ans = 0;
		int M = Integer.parseInt(tokens.nextToken());
		tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(tokens.nextToken());
			int cnt = 0;
			while (!q.isEmpty()) {
				if (q.peek() == num) {
					q.poll();
					break;
				} else {
					q.add(q.poll());
					cnt++;
				}
			}
			cnt = cnt > q.size() + 1 - cnt ? q.size() + 1 - cnt : cnt;
			ans += cnt;
		}

		System.out.println(ans);
	}
}