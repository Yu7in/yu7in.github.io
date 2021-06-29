// BOJ_10818번_최소, 최대

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tokens.nextToken());
		}
		
		Arrays.sort(arr);

		System.out.println(arr[0] + " " + arr[N - 1]);
	}
}
