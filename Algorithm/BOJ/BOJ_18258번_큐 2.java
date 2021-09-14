//BOJ_18258번_큐 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			String str = tokens.nextToken();
			if (str.equals("push")) {
				dq.add(Integer.parseInt(tokens.nextToken()));
			} else if (str.equals("pop")) {
				if (!dq.isEmpty()) {
					sb.append(dq.poll()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			} else if (str.equals("size")) {
				sb.append(dq.size()).append("\n");
			} else if (str.equals("empty")) {
				if (dq.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if (str.equals("front")) {
				if (!dq.isEmpty()) {
					sb.append(dq.peekFirst()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			} else if (str.equals("back")) {
				if (!dq.isEmpty()) {
					sb.append(dq.peekLast()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			}
		}

		System.out.println(sb);
	}
}