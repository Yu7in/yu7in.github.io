// BOJ_1259번_팰린드롬수

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = br.readLine();
			if (str.equals("0")) {
				break;
			}

			StringBuffer buffer = new StringBuffer(str);
			String reverseStr = buffer.reverse().toString();
			if (str.equals(reverseStr)) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
