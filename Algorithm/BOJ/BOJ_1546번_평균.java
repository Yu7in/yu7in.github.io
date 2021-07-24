//BOJ_1546번_평균

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int maxNum = 0;
		double avg = 0;

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
			avg += arr[i];
			maxNum = maxNum < arr[i] ? arr[i] : maxNum;
		}

		avg = avg / maxNum * 100;
		avg /= N;

		System.out.println(avg);
	}
}
