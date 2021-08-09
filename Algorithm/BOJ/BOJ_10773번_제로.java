//BOJ_10773번_제로

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> s = new Stack<>();
		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				if (!s.isEmpty())
					s.pop();
			} else {
				s.push(num);
			}
		}

		int sum = 0;
		while (!s.isEmpty()) {
			sum += s.pop();
		}

		System.out.println(sum);
	}
}
