import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int F, S, G, U, D;
	public static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		F = Integer.parseInt(tokens.nextToken());
		S = Integer.parseInt(tokens.nextToken());
		G = Integer.parseInt(tokens.nextToken());
		U = Integer.parseInt(tokens.nextToken());
		D = Integer.parseInt(tokens.nextToken());

		arr = new int[F + 1];
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { S, 0 });
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			int up = temp[0] + U;
			int down = temp[0] - D;
			if (up <= F && up != S) {
				if (arr[up] == 0) {
					arr[up] = temp[1] + 1;
					q.add(new int[] { up, arr[up] });
				} else if (arr[up] > temp[1] + 1) {
					arr[up] = temp[1] + 1;
					q.add(new int[] { up, arr[up] });
				}
			}
			if (down > 0 && down != S) {
				if (arr[down] == 0) {
					arr[down] = temp[1] + 1;
					q.add(new int[] { down, arr[down] });
				} else if (arr[down] > temp[1] + 1) {
					arr[down] = temp[1] + 1;
					q.add(new int[] { down, arr[down] });
				}
			}
		}

		if (S != G && arr[G] == 0) {
			System.out.println("use the stairs");
		} else {
			System.out.println(arr[G]);
		}
	}
}
