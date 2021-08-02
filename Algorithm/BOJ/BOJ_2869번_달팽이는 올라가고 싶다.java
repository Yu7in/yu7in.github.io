//BOJ_2869번_달팽이는 올라가고 싶다

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(tokens.nextToken());
		int B = Integer.parseInt(tokens.nextToken());
		int V = Integer.parseInt(tokens.nextToken());

		V -= A;
		int ans = V / (A - B);
		if (V % (A - B) != 0) {
			ans++;
		}

		System.out.println(ans + 1);
	}
}
