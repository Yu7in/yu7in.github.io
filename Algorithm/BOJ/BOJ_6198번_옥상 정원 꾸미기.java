// BOJ_6198번_옥상 정원 꾸미기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Stack<long[]> s1 = new Stack<>();
		for (int i = 0; i < N; i++) {
			s1.add(new long[] { Integer.parseInt(br.readLine()), 0 });
		}

		long cnt = 0;
		Stack<long[]> s2 = new Stack<>();
		while (!s1.isEmpty()) {
			long[] temp1 = s1.pop();
			while (!s2.isEmpty()) {
				long[] temp2 = s2.peek();
				if (temp1[0] <= temp2[0]) {
					break;
				} else {
					s2.pop();
					cnt += temp2[1];
					temp1[1] = temp1[1] + temp2[1] + 1;
				}
			}
			s2.add(temp1);
		}

		while (!s2.isEmpty()) {
			long[] temp = s2.pop();
			cnt += temp[1];
		}

		System.out.println(cnt);
	}
}
