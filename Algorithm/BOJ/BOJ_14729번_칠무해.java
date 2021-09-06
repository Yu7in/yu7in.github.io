//BOJ_14729번_칠무해

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Double> pq = new PriorityQueue<>();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			pq.add(Double.parseDouble(br.readLine()));
		}

		for (int i = 0; i < 7; i++) {
			sb.append(String.format("%.3f", pq.poll())).append("\n");
		}

		System.out.println(sb);
	}
}