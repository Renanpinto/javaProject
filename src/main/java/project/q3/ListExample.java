package project.q3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListExample {
	public static void main(String[] args) {
		List lst = new ArrayList();
	    lst.add(new	Integer(12).intValue());
		lst.add(new String("Opaa"));
		lst.add(new Boolean(true));

		Arrays.sort(lst.toArray());
		for(int i=0; i<	lst.size();	i++) {
			System.out.println(lst.get(i).toString());
		}
	}
}
