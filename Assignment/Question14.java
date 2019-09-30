package Assignment;

import java.util.*;

public class Question14 {

	public static void color() {
		LinkedList<String> clist = new LinkedList<String>();
		clist.add("Red");
		clist.add("Green");
		clist.add("Black");
		clist.add("Pink");
		clist.add("orange");


		System.out.println("The Original linked list: " + clist);

		clist.clear();

		System.out.println("The New linked list: " + clist);
	}
}
