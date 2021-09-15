//BOJ_3078번_좋은 친구

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

		Queue<Integer>[] q = new Queue[21];
		for (int i = 0; i < q.length; i++) {
			q[i] = new LinkedList<>();
		}

		long ans = 0;
		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			int len = str.length();
			while (!q[len].isEmpty()) {
				if (i - q[len].peek() > K) {
					q[len].poll();
				} else {
					break;
				}
			}
			ans += q[len].size();
			q[len].add(i);
		}

		System.out.println(ans);
	}
}