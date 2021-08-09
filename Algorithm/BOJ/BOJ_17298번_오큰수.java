//BOJ_17298번_오큰수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		Stack<int[]> s = new Stack<>();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(tokens.nextToken());
			if (s.isEmpty()) {
				s.push(new int[] { i, num });
			} else {
				while (!s.isEmpty() && s.peek()[1] < num) {
					int[] temp = s.pop();
					arr[temp[0]] = num;
				}
				s.push(new int[] { i, num });
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				sb.append(-1).append(" ");
			} else {
				sb.append(arr[i]).append(" ");
			}
		}

		System.out.println(sb);
	}
}
