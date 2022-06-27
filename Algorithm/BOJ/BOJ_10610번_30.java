import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();

		int sum = 0;
		boolean checked = false;
		for (int i = 0; i < N.length(); i++) {
			int ch = N.charAt(i) - '0';
			if (!checked && ch == 0) {
				checked = true;
			}
			sum += ch;
		}

		StringBuilder sb = new StringBuilder();
		if (checked && sum % 3 == 0) {
			char[] temp = N.toCharArray();
			Arrays.sort(temp);
			for (int i = temp.length - 1; i >= 0; i--) {
				sb.append(temp[i]);
			}
		} else {
			sb.append("-1");
		}

		System.out.println(sb);
	}
}
