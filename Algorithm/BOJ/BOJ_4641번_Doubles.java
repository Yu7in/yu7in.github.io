//BOJ_4641번_Doubles

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			HashSet<Integer> hs = new HashSet<>();
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			while (tokens.hasMoreTokens()) {
				int num = Integer.parseInt(tokens.nextToken());
				if (num != 0)
					hs.add(num);
			}
			if (hs.contains(-1))
				break;

			int cnt = 0;
			for (Integer temp : hs) {
				if (hs.contains(temp * 2))
					cnt++;
			}

			sb.append(cnt).append("\n");
		}

		System.out.println(sb);
	}
}
