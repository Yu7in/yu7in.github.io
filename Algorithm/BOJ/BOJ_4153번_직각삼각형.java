//BOJ_4153번_직각삼각형

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(tokens.nextToken());
			arr[1] = Integer.parseInt(tokens.nextToken());
			arr[2] = Integer.parseInt(tokens.nextToken());

			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
				break;

			Arrays.sort(arr);
			if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) {
				sb.append("right").append("\n");
			} else {
				sb.append("wrong").append("\n");
			}
		}
		System.out.println(sb);
	}
}
