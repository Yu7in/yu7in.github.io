import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());

		// 여학생의 수 N, 남학생의 수 M, 인턴쉽에 참여해야하는 인원 K
		int N = Integer.parseInt(tokens.nextToken());
		int M = Integer.parseInt(tokens.nextToken());
		int K = Integer.parseInt(tokens.nextToken());

		int ans = 0;
		while ((N - 2) >= 0 && (M - 1) >= 0) {
			N -= 2;
			M -= 1;
			if (N + M < K)
				break;

			ans++;
		}

		System.out.println(ans);
	}
}
