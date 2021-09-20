//BOJ_11724번_연결 요소의 개수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());

		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			arr.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			tokens = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(tokens.nextToken());
			int v = Integer.parseInt(tokens.nextToken());
			arr.get(u).add(v);
			arr.get(v).add(u);
		}

		int ans = 0;
		boolean[] visited = new boolean[N + 1];
		for (int i = 1; i < visited.length; i++) {
			if (!visited[i]) {
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(i);
				visited[i] = true;
				while (!q.isEmpty()) {
					int num = q.poll();
					for (int j = 0; j < arr.get(num).size(); j++) {
						if (!visited[arr.get(num).get(j)]) {
							visited[arr.get(num).get(j)] = true;
							q.add(arr.get(num).get(j));
						}
					}
				}
				ans++;
			}
		}

		System.out.println(ans);
	}
}