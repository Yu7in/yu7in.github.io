import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int n, m, p1, p2, ans;
	public static boolean visited[];
	public static ArrayList<ArrayList<Integer>> arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		p1 = Integer.parseInt(tokens.nextToken());
		p2 = Integer.parseInt(tokens.nextToken());

		visited = new boolean[n + 1];
		arr = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			arr.add(new ArrayList<Integer>());
		}

		m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			tokens = new StringTokenizer(br.readLine());
			int parent = Integer.parseInt(tokens.nextToken());
			int child = Integer.parseInt(tokens.nextToken());

			arr.get(parent).add(child);
			arr.get(child).add(parent);
		}

		ans = -1;
		visited[p1] = true;
		Queue<int[]> q = new LinkedList<int[]>();
		for (int i = 0; i < arr.get(p1).size(); i++) {
			q.add(new int[] { arr.get(p1).get(i), 1 });
			visited[arr.get(p1).get(i)] = true;
		}

		ans = -1;
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			if (temp[0] == p2) {
				ans = temp[1];
				break;
			}
			for (int i = 0; i < arr.get(temp[0]).size(); i++) {
				if (!visited[arr.get(temp[0]).get(i)]) {
					q.add(new int[] { arr.get(temp[0]).get(i), temp[1] + 1 });
					visited[arr.get(temp[0]).get(i)] = true;
				}
			}
		}

		System.out.println(ans);
	}
}
