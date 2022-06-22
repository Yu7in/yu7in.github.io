import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int n, startX, startY, endX, endY;
	public static ArrayList<int[]> arr;
	public static int[][] station;
	public static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			n = Integer.parseInt(br.readLine());

			arr = new ArrayList<int[]>();
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			startX = Integer.parseInt(tokens.nextToken());
			startY = Integer.parseInt(tokens.nextToken());
			arr.add(new int[] { startX, startY });

			for (int i = 0; i < n; i++) {
				tokens = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(tokens.nextToken());
				int y = Integer.parseInt(tokens.nextToken());
				arr.add(new int[] { x, y });
			}

			tokens = new StringTokenizer(br.readLine());
			endX = Integer.parseInt(tokens.nextToken());
			endY = Integer.parseInt(tokens.nextToken());
			arr.add(new int[] { endX, endY });

			station = new int[n + 2][n + 2];
			visited = new boolean[n + 2];
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int j = i + 1; j < arr.size(); j++) {
					int len = Math.abs(arr.get(i)[0] - arr.get(j)[0]) + Math.abs(arr.get(i)[1] - arr.get(j)[1]);
					station[i][j] = len;
					station[j][i] = len;
				}
			}

			Queue<Integer> q = new LinkedList<>();
			q.add(0);
			while (!q.isEmpty()) {
				int temp = q.poll();
				for (int i = 0; i < n + 2; i++) {
					if (temp != i && !visited[i]) {
						if (station[temp][i] <= 50 * 20) {
							visited[i] = true;
							q.add(i);
						}
					}
				}
			}

			if (visited[n + 1]) {
				sb.append("happy");
			} else {
				sb.append("sad");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
