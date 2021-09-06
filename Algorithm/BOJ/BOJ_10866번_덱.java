//BOJ_10866번_덱

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Deque<Integer> dq = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			String str = tokens.nextToken();
			if (str.equals("push_front")) {
				dq.addFirst(Integer.parseInt(tokens.nextToken()));
			} else if (str.equals("push_back")) {
				dq.addLast(Integer.parseInt(tokens.nextToken()));
			} else if (str.equals("pop_front")) {
				if (!dq.isEmpty()) {
					sb.append(dq.pollFirst()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			} else if (str.equals("pop_back")) {
				if (!dq.isEmpty()) {
					sb.append(dq.pollLast()).append("\n");
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