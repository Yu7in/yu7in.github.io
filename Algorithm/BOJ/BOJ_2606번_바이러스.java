//BOJ_2606번_바이러스

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			arr.add(new ArrayList<>());
		}

		int P = Integer.parseInt(br.readLine());
		for (int i = 0; i < P; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tokens.nextToken());
			int b = Integer.parseInt(tokens.nextToken());
			arr.get(a).add(b);
			arr.get(b).add(a);
		}

		int ans = 0;
		boolean[] visited = new boolean[N + 1];
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		visited[1] = true;
		while (!q.isEmpty()) {
			int num = q.poll();
			for (int i = 0; i < arr.get(num).size(); i++) {
				if (!visited[arr.get(num).get(i)]) {
					visited[arr.get(num).get(i)] = true;
					q.add(arr.get(num).get(i));
					ans++;
				}
			}
		}

		System.out.println(ans);
	}
}