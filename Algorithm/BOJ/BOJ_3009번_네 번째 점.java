//BOJ_3009번_네 번째 점

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer, Integer> hmX = new HashMap<>();
		HashMap<Integer, Integer> hmY = new HashMap<>();
		for (int i = 0; i < 3; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(tokens.nextToken());
			int y = Integer.parseInt(tokens.nextToken());
			if (hmX.containsKey(x))
				hmX.put(x, hmX.get(x) + 1);
			else
				hmX.put(x, 1);
			if (hmY.containsKey(y))
				hmY.put(y, hmY.get(y) + 1);
			else
				hmY.put(y, 1);
		}

		int ansX = 0;
		for (Integer i : hmX.keySet()) {
			if (hmX.get(i) == 1) {
				ansX = i;
				break;
			}
		}

		int ansY = 0;
		for (Integer i : hmY.keySet()) {
			if (hmY.get(i) == 1) {
				ansY = i;
				break;
			}
		}

		System.out.println(ansX + " " + ansY);
	}
}
