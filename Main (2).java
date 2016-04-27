import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// task6
		// int[] nums;
		// nums = new int[10];
		//
		// for (int i = 0; i < 10; i++) {
		// System.out.print("Enter an integer: ");
		// int n = input.nextInt();
		// nums[i] = n;
		// }
		//
		// System.out.print("Enter another int: ");
		// int s = input.nextInt();
		// int t = 0;
		//
		// for (int i = 0; i < 10; i++) {
		// if (nums[i] == s) {
		// t += 1;
		// }
		//
		// }
		// System.out.println(t);
		// input.close();
		//
		// task 7
//		int[] arr = { 1, 2, 3, 4, 5, 6 };
//
//		System.out.print("Enter a number between 0 and 5: ");
//		int index = input.nextInt();
//		System.out.print("Enter another number: ");
//		int n = input.nextInt();
//
//		int[] arrnew = new int[arr.length];
//		for (int i = 0; i < arrnew.length; i++) {
//			if (i < index) {
//				arrnew[i] = arr[i];
//			} else if (i == index) {
//				arrnew[i] = n;
//			} else if (i > index) {
//				arrnew[i] = arr[i - 1];
//			} else {
//				System.out.println("err");
//			}w
//		}
//		arr = arrnew;
//		for (int i = 0; i < arrnew.length; i++) {
//			System.out.println(arr[i]);
//		}
		//Task 8 
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		char[] sts = str.toCharArray();
		char[] rev = new char[sts.length];
		int t = 0;
		for (int i = sts.length - 1; i >= 0; i--){
			rev[i] = sts[t];
			t++;
			
		}
		
		for (int i = 0; i < rev.length; i++){
			System.out.println(rev[i]);
	}
}
}
