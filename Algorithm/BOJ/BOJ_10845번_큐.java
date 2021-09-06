//BOJ_10845번_큐

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		int back = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			String str = tokens.nextToken();
			if (str.equals("push")) {
				back = Integer.parseInt(tokens.nextToken());
				q.add(back);
			} else if (str.equals("pop")) {
				if (!q.isEmpty()) {
					sb.append(q.poll()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			} else if (str.equals("size")) {
				sb.append(q.size()).append("\n");
			} else if (str.equals("empty")) {
				if (!q.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(1).append("\n");
				}
			} else if (str.equals("front")) {
				if (!q.isEmpty()) {
					sb.append(q.peek()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			} else if (str.equals("back")) {
				if (!q.isEmpty()) {
					sb.append(back).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}