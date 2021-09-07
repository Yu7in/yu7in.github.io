//BOJ_1966번_프린터 큐

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(tokens.nextToken());
			int M = Integer.parseInt(tokens.nextToken());

			Queue<int[]> q = new LinkedList<>();
			PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return Integer.compare(o2, o1);
				}
			});

			int idx = 0;
			tokens = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int num = Integer.parseInt(tokens.nextToken());
				q.add(new int[] { i, num });
				pq.add(num);
				if (M == i) {
					idx = i;
				}
			}

			int cnt = 0;
			while (!q.isEmpty() && !pq.isEmpty()) {
				int[] temp = q.poll();
				if (temp[1] == pq.peek()) {
					cnt++;
					if (temp[0] == idx) {
						break;
					} else {
						pq.poll();
					}
				} else {
					q.add(temp);
				}
			}

			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
	}
}