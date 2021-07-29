//BOJ_4673번_셀프 넘버

public class Main {
	public static void main(String[] args) throws Exception {
		int num = 1;
		int[] arr = new int[10001];
		while (true) {
			int temp = num;
			int sum = num;
			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if (sum < 10001) {
				arr[sum] = 1;
			}
			num++;
			if (num >= 10000)
				break;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0)
				System.out.println(i);
		}
	}
}
