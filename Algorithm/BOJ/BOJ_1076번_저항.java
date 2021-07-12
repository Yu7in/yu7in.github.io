//BOJ_1076번_저항

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<String, int[]> hm = new HashMap<>();
		hm.put("black", new int[] { 0, 1 });
		hm.put("brown", new int[] { 1, 10 });
		hm.put("red", new int[] { 2, 100 });
		hm.put("orange", new int[] { 3, 1000 });
		hm.put("yellow", new int[] { 4, 10000 });
		hm.put("green", new int[] { 5, 100000 });
		hm.put("blue", new int[] { 6, 1000000 });
		hm.put("violet", new int[] { 7, 10000000 });
		hm.put("grey", new int[] { 8, 100000000 });
		hm.put("white", new int[] { 9, 1000000000 });

		String color1 = br.readLine();
		String color2 = br.readLine();
		String color3 = br.readLine();

		long num = (long) hm.get(color1)[0] * 10;
		num += (long) hm.get(color2)[0];
		num *= (long) hm.get(color3)[1];
		System.out.println(num);
	}
}
