//BOJ_1236번_성 지키기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());

		HashSet<Integer> col = new HashSet<>();
		HashSet<Integer> row = new HashSet<>();

		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
			for (int j = 0; j < M; j++) {
				if (arr[i].charAt(j) == 'X') {
					col.add(j);
					row.add(i);
				}
			}
		}

		int colNum = M - col.size();
		int rowNum = N - row.size();
		System.out.println(Math.max(colNum, rowNum));
	}
}
