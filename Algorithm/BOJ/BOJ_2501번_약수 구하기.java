//BOJ_2501번_약수 구하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(tokens.nextToken());
		int K = Integer.parseInt(tokens.nextToken());

		int num = 1;
		ArrayList<Integer> arr = new ArrayList<>();
		while (true) {
			if (arr.contains(num))
				break;

			if (N % num == 0) {
				arr.add(num);
				if (N / num != num)
					arr.add(N / num);
			}
			num++;
		}
		Collections.sort(arr);
		if (arr.size() < K)
			System.out.println(0);
		else
			System.out.println(arr.get(K - 1));
	}
}
