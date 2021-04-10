// BOJ_11866번_요세푸스 문제 0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		int K = Integer.parseInt(tokens.nextToken());

		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}

		int idx = 0;
		int[] ans = new int[N];
		while (!q.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				int a = q.poll();
				q.add(a);
			}
			ans[idx++] = q.poll();
		}
		
		System.out.print("<");
		for (int i = 0; i < N; i++) {
			System.out.print(ans[i]);
			if(i!=N-1) {
				System.out.print(", ");
			}
		}
		System.out.print(">");
	}
}
