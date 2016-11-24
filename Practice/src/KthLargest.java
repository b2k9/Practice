import java.util.Arrays;

public class KthLargest {

	public static void main(String[] args) {
		int array[] = { 6, 4, 2, 9, 1, 8, 7, 3};
		KthLargest lar = new KthLargest();
		//System.out.println("Kth Largest num is ::" + lar.getKthLargest(3, array));
		System.out.println("Kth Largest num is ::" + lar.getKthLargestWithoutMethod(3, array));
	}

//	public int getKthLargest(int k, int[] arr) {
//		Arrays.sort(arr);
//		return arr[arr.length - k];
//	}

	public int getKthLargestWithoutMethod(int k, int[] arr) {
		if (k < 1 || arr == null) {
			return 0;
		} else {
			int lowIndex=0;
			int highIndex=arr.length-1;
			int pivotElement=arr[highIndex/2];
			while(lowIndex<=highIndex){
				
			}
			return pivotElement;
		}
	}
}
