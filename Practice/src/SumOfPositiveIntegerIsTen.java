import java.util.HashMap;


public class SumOfPositiveIntegerIsTen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[]={6,4,2,9,1,8,7,3,5};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int sum=10;
		
		for(int i=0;i<array.length;i++)
		{
			int diff=sum-array[i];
			if(map.containsKey(diff))
			{
				System.out.println(" "+array[i]+" -- "+diff);
			}
			map.put(i, array[i]);
		}
	}
}
