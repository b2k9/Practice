class InheritTest
	{
		public static void overrideAllow()
		{
			System.out.println("Hi i am parent class method");
		}
	}
public class InherStatic extends InheritTest {
	public static void overrideAllow()
	{
		System.out.println("Hi i am Child class method");
	}
	public static void main(String[] args) {
		InheritTest st=new InherStatic();
		st.overrideAllow();
	}
	
}