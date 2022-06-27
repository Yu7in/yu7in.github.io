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

			// arr : 출발지(상근이집), n개의 편의점, 도착지(페스티벌) 총 n+2개의 위치 좌표 저장 
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

			// station : arr에 저장된 위치들 사이의 거리를 저장 (station[i][j]는 arr.get(i)와 arr.get(j) 사이의 거리 )
			// visited : arr.get(i)를 방문했는지 여부. 방문했으면 visited[i] = true
			station = new int[n + 2][n + 2];
			visited = new boolean[n + 2];
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int j = i + 1; j < arr.size(); j++) {
					int len = Math.abs(arr.get(i)[0] - arr.get(j)[0]) + Math.abs(arr.get(i)[1] - arr.get(j)[1]);
					station[i][j] = len;
					station[j][i] = len;
				}
			}

			// BFS 사용 
			Queue<Integer> q = new LinkedList<>();
			q.add(0); // 출발지 위치부터 시작 
			while (!q.isEmpty()) {
				int temp = q.poll();
				for (int i = 0; i < n + 2; i++) {
					if (temp != i && !visited[i]) {
						// 하나의 위치에서 다른 위치로 이동 가능한 경우:  맥주 20병 * 한 병당 가능한 거리 50미터 
						if (station[temp][i] <= 50 * 20) {
							visited[i] = true;
							q.add(i);
						}
					}
				}
			}

			// 방문 했을 시 happy, 실패 시 sad
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
