
package study;

public class countBit2 {
	public static void main(String[] args) {
		int cnt = countBits(5);
		System.out.println("Git Test! by myself");
		System.out.println("Conflict");
	}

	public static int countBits(int number) {
		int num = number;
		int i = 0;

		while (num > 0) {
			num /= 2;
			i++;
		}

		int[] arr = new int[i];
		int j = 0;
		num = number;
		while (num > 0) {
			arr[j] = num % 2;
			num /= 2;
			j++;
		}

		int cnt = 0;

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == 1) {
				cnt++;
			}
		}

		return cnt;
	}
}