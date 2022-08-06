import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int N;
	public static String ans;
	public static char[][] arr;
	public static ArrayList<int[]> xloc, tloc;
	public static int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		arr = new char[N][N];
		xloc = new ArrayList<int[]>();
		tloc = new ArrayList<int[]>();
		for (int i = 0; i < N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = tokens.nextToken().charAt(0);
				if (arr[i][j] == 'X') {
					xloc.add(new int[] { i, j });
				} else if (arr[i][j] == 'T') {
					tloc.add(new int[] { i, j });
				}
			}
		}

		ans = "NO";
		findCombi(0, 0, new int[3]);

		System.out.println(ans);
	}

	public static void findCombi(int idx, int cnt, int[] temp) {
		if (cnt == 3) {
			for (int i = 0; i < temp.length; i++) {
				arr[xloc.get(temp[i])[0]][xloc.get(temp[i])[1]] = 'O';
			}

			ans = "YES";
			for (int i = 0; i < tloc.size(); i++) {
				int[] teacher = tloc.get(i);
				for (int d = 0; d < dirs.length; d++) {
					int num = 1;
					while (true) {
						int tx = teacher[0] + dirs[d][0] * num;
						int ty = teacher[1] + dirs[d][1] * num;
						if (tx >= 0 && ty >= 0 && tx < N && ty < N) {
							if (arr[tx][ty] == 'O') {
								break;
							} else if (arr[tx][ty] == 'S') {
								ans = "NO";
								break;
							}
							num++;
						} else {
							break;
						}
					}
					if (ans.equals("NO")) {
						break;
					}
				}
				if (ans.equals("NO")) {
					break;
				}
			}

			for (int i = 0; i < temp.length; i++) {
				arr[xloc.get(temp[i])[0]][xloc.get(temp[i])[1]] = 'X';
			}
		} else {
			for (int i = idx; i < xloc.size(); i++) {
				temp[cnt] = i;
				findCombi(i + 1, cnt + 1, temp);
				if (ans.equals("YES"))
					return;
			}
		}
	}
}