//BOJ_1697번_숨바꼭질

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken());
		int K = Integer.parseInt(tokens.nextToken());

		int[] arr = new int[200001];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(N);
		arr[N] = 1;
		while (!q.isEmpty()) {
			int num = q.poll();
			if (num * 2 < 200001 && (arr[num * 2] == 0 || arr[num * 2] > arr[num] + 1)) {
				arr[num * 2] = arr[num] + 1;
				q.add(num * 2);
			}
			if (num + 1 < 200001 && (arr[num + 1] == 0 || arr[num + 1] > arr[num] + 1)) {
				arr[num + 1] = arr[num] + 1;
				q.add(num + 1);
			}
			if (num - 1 >= 0 && (arr[num - 1] == 0 || arr[num - 1] > arr[num] + 1)) {
				arr[num - 1] = arr[num] + 1;
				q.add(num - 1);
			}
		}

		System.out.println(arr[K] - 1);
	}
}