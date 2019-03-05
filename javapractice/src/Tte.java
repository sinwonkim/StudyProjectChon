public class Tte {

	public static void main(String[] args) {
		int [] arr = {10, 2, 6, 4, 3, 7, 5};
		for (int i = 1; i < arr.length; i++) {
			int standard = arr[i];  
			int distint = i - 1;   
			while (distint >= 0 && standard < arr[distint]) {
				arr[distint + 1] = arr[distint];   
				distint--;
			}
			arr[distint + 1] = standard;  
		}
		printArr(arr);
	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
