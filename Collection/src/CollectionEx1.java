import java.util.*;
public class CollectionEx1 {
	public static void main(String[] args) {
		//HashSet a = new HashSet();
		ArrayList a = new ArrayList();
		a.add("ram");
		a.add(12);
		a.add(12);
		a.add(25);
		
		System.out.println(a);
		System.out.println(a.get(1));
		for(Object x:a) {
			System.out.println(x);
		}
	}

}
