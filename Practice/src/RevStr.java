
public class RevStr {

	public static void main(String[] args) {
		int arr[]={2,8,3,4,9,18};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
		}
		System.out.println("Largest Number in array is::"+largest);
	}

}
