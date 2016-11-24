
public class ReverseString {

	public static void main(String[] args) {
		String str="Hello How are you";
         ReverseString rev=new ReverseString();
         String revString=rev.reverseMe(str);
         System.out.println(revString);
	}

	private String reverseMe(String str) {
		StringBuilder sb=new StringBuilder();
		char strC[]=str.toCharArray();
		for(int i=strC.length-1;i>=0;i--)
		{
			sb.append(strC[i]);
		}
		return sb.toString();
	}

}
