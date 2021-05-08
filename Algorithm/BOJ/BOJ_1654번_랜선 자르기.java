// BOJ_1654번_랜선 자르기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(tokens.nextToken());
		int N = Integer.parseInt(tokens.nextToken());
		int[] arr = new int[K];
		int maxNum = 0;
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			maxNum = maxNum < arr[i] ? arr[i] : maxNum;
		}

		long max = maxNum;
		long min = 1;
		while (min <= max) {
			long num = (max + min) / 2;
			long count = 0;
			for (int i = 0; i < arr.length; i++) {
				count += (arr[i] / num);
			}
			
			if(count < N) {
				max = num - 1;
			}else {
				min = num + 1;
			}
		}
		
		System.out.println(max);
	}
}
