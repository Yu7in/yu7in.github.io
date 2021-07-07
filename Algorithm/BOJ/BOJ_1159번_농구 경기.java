//BOJ_1159번_농구 경기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if (hm.containsKey(str.charAt(0))) {
				hm.put(str.charAt(0), hm.get(str.charAt(0)) + 1);
			} else {
				hm.put(str.charAt(0), 1);
			}
		}

		PriorityQueue<Character> pq = new PriorityQueue<>();
		for (Character ch : hm.keySet()) {
			if (hm.get(ch) >= 5) {
				pq.add(ch);
			}
		}

		String answer = "";
		if (pq.isEmpty()) {
			answer = "PREDAJA";
		} else {
			while (!pq.isEmpty()) {
				answer += pq.poll();
			}
		}
		System.out.println(answer);
	}
}
