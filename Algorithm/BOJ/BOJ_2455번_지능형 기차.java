//BOJ_2455번_지능형 기차

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		int max = 0;
		for (int i = 0; i < 4; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int out = Integer.parseInt(tokens.nextToken());
			int in = Integer.parseInt(tokens.nextToken());
			num -= out;
			num += in;
			max = max < num ? num : max;
		}
		
		System.out.println(max);
	}
}
