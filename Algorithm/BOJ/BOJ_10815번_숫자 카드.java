import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int N, M;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		HashSet<Integer> hs = new HashSet<>();
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			hs.add(Integer.parseInt(tokens.nextToken()));
		}
		
		M = Integer.parseInt(br.readLine());
		tokens = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(tokens.nextToken());
			if(hs.contains(num)) {
				sb.append(1).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		
		System.out.println(sb);
	}
}