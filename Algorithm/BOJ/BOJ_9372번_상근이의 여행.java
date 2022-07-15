import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int N, M, ans;
	public static boolean[] visited;
	public static ArrayList<ArrayList<Integer>> arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			N = Integer.parseInt(tokens.nextToken());
			M = Integer.parseInt(tokens.nextToken());

			arr = new ArrayList<>();
			for (int i = 0; i < N + 1; i++) {
				arr.add(new ArrayList<Integer>());
			}

			for (int i = 0; i < M; i++) {
				tokens = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(tokens.nextToken());
				int b = Integer.parseInt(tokens.nextToken());
				arr.get(a).add(b);
				arr.get(b).add(a);
			}

			ans = 0;
			visited = new boolean[N + 1];
			Queue<Integer> q = new LinkedList<>();
			q.add(1);
			visited[1] = true;
			while (!q.isEmpty()) {
				ans++;
				int temp = q.poll();
				for (int i = 0; i < arr.get(temp).size(); i++) {
					if (!visited[arr.get(temp).get(i)]) {
						q.add(arr.get(temp).get(i));
						visited[arr.get(temp).get(i)] = true;
					}
				}
			}

			sb.append(ans - 1).append("\n");
		}
		System.out.println(sb);
	}

}
