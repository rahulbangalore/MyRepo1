package Assignment;

import java.util.*;

public class Question15 {


	public static void swap(List<String> Swaplist) {
		
		System.out.println("Here are the countries stored in the LinkedList: ");
		
		System.out.println(Swaplist);
		Collections.swap(Swaplist, 0, 2);
		System.out.println(" Swapped linked list: " + Swaplist);
	}
}
