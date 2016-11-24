
public class NthLargest {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 8, 5, 6, 4, 9, 16, 34 };
        NthLargest lrg=new NthLargest();
		System.out.println("Largest Number is:::" + lrg.getLargest(arr));
		System.out.println("4th Largest Number is:::" + lrg.getNthLargest(4, arr));
		System.out.println("3rd Largest Number is:::" + lrg.getNthLargest(3, arr));
	}

	public int getLargest(int lar[]) {
		int largest = lar[0];
		for (int i = 0; i < lar.length; i++) {
			if (lar[i] > largest)
				largest = lar[i];
		}
		return largest;
	}
	
	public int getNthLargest(int ind,int lar[])
	{
		int smallest=lar[0];
		for (int i = 0; i < lar.length; i++) {
			if (lar[i] < smallest)
				lar[i]=smallest;
		}
		return lar[lar.length-ind];
	}
}
