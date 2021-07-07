//BOJ_1152번_단어의 개수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int cnt = 0;
		while (tokens.hasMoreTokens()) {
			cnt++;
			tokens.nextToken();
		}
		System.out.println(cnt);
	}
}
