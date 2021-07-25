//BOJ_2456번_나는 학급회장이다

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int maxNum = 0;
		int[] sum = new int[4];
		int[][] cnt = new int[4][4];
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			for (int j = 1; j < 4; j++) {
				int num = Integer.parseInt(tokens.nextToken());
				sum[j] += num;
				cnt[j][num]++;
				maxNum = maxNum < sum[j] ? sum[j] : maxNum;
			}
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i < sum.length; i++) {
			if (sum[i] == maxNum)
				q.add(i);
		}

		if (q.size() != 1) {
			int idx = 3;
			while (q.size() > 1 && idx > 1) {
				int max = 0;
				int size = q.size();
				for (int i = 0; i < size; i++) {
					int temp = q.poll();
					max = max < cnt[temp][idx] ? cnt[temp][idx] : max;
					q.add(temp);
				}
				for (int i = 0; i < size; i++) {
					int temp = q.poll();
					if (cnt[temp][idx] == max) {
						q.add(temp);
					}
				}
				idx--;
			}
		}

		if (q.size() == 1) {
			System.out.println(q.poll() + " " + maxNum);
		} else {
			System.out.println(0 + " " + maxNum);
		}
	}
}
