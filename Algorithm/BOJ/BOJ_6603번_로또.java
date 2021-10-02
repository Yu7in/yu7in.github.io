//BOJ_6603번_로또

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int k;
	public static int[] arr;
	public static StringBuilder sb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		while (true) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			k = Integer.parseInt(tokens.nextToken());

			if (k == 0)
				break;

			arr = new int[k];
			for (int i = 0; i < k; i++) {
				arr[i] = Integer.parseInt(tokens.nextToken());
			}

			findAns(0, 0, new int[6]);
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public static void findAns(int n, int idx, int[] temp) {
		if (n == 6) {
			for (int i = 0; i < temp.length; i++) {
				sb.append(temp[i]).append(" ");
			}
			sb.append("\n");
		} else {
			for (int i = idx; i < arr.length; i++) {
				temp[n] = arr[i];
				findAns(n + 1, i + 1, temp);
			}
		}
	}
}