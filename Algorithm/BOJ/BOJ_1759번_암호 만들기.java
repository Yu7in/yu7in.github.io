//BOJ_1759번_암호 만들기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static int L, C;
	public static char[] arr;
	public static HashSet<Character> hs;
	public static StringBuilder sb;
	public static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokens = new StringTokenizer(br.readLine());
		L = Integer.parseInt(tokens.nextToken());
		C = Integer.parseInt(tokens.nextToken());

		arr = new char[C];
		tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < C; i++) {
			arr[i] = tokens.nextToken().charAt(0);
		}
		
		Arrays.sort(arr);

		hs = new HashSet<>();
		sb = new StringBuilder();
		findAns(0, 0);

		System.out.println(sb);
	}

	public static void findAns(int n, int idx) {
		if (n == L) {
			int vcnt = 0;
			for (int i = 0; i < vowels.length; i++) {
				if (hs.contains(vowels[i]))
					vcnt++;
			}

			if (vcnt >= 1 && hs.size() - vcnt >= 2) {
				char[] temp = new char[hs.size()];
				int i = 0;
				for (Character ch : hs) {
					temp[i++] = ch;
				}
				Arrays.sort(temp);
				for (int j = 0; j < temp.length; j++) {
					sb.append(temp[j]);
				}
				sb.append("\n");
			}
		} else {
			for (int i = idx; i < arr.length; i++) {
				hs.add(arr[i]);
				findAns(n + 1, i + 1);
				hs.remove(arr[i]);
			}
		}
	}
}