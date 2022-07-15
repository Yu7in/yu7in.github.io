import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int H, W, ans;
	public static int[][] arr, sum;
	public static int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 },
			{ -1, -1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		H = Integer.parseInt(tokens.nextToken());
		W = Integer.parseInt(tokens.nextToken());

		arr = new int[H][W];
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < H; i++) {
			String str = br.readLine();
			for (int j = 0; j < W; j++) {
				if (str.charAt(j) == '.') {
					arr[i][j] = 0;
					q.add(new int[] {i, j, 0});
				} else {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
		}
		
		sum = new int[H][W];
		while(!q.isEmpty()) {
			int[] temp = q.poll();
			ans = temp[2];
			
			for (int d = 0; d < dirs.length; d++) {
				int dx = temp[0] + dirs[d][0];
				int dy = temp[1] + dirs[d][1];
				if(dx>=0 && dy>=0 && dx<H && dy<W) {
					if(arr[dx][dy]!=0) {
						sum[dx][dy]++;
						if(sum[dx][dy] >= arr[dx][dy]) {
							arr[dx][dy] = 0;
							q.add(new int[] {dx,dy, temp[2]+1});
							continue;
						}
					}
				}
			}
		}
		
		System.out.println(ans);
	}

}
