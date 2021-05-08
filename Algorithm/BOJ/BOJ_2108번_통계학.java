// BOJ_2108번_통계학

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		double sum = 0;
		int[] arr = new int[T];
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}

		Arrays.sort(arr);
		
		sb.append(Math.round(sum / T)).append("\n");
		sb.append(arr[T / 2]).append("\n");

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = max < hm.get(arr[i]) ? hm.get(arr[i]) : max;
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.get(arr[i]) == max && !q.contains(arr[i])) {
				q.add(arr[i]);
			}
		}

		if (q.size() == 1) {
			sb.append(q.poll()).append("\n");
		} else {
			q.poll();
			sb.append(q.poll()).append("\n");
		}

		sb.append(arr[T - 1] - arr[0]);

		System.out.println(sb);
	}
}
