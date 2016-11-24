import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHasmap {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		Test test=new Test();
		Test test1=new Test();
		m.put(test,"a");
		m.put(test1, "b");
		m.put("3", "c");
		System.out.println(m.size());
		System.out.println(test.hashCode()+"/"+test1.hashCode());
	}
}
