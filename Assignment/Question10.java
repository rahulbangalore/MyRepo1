package Assignment;

import java.util.*;

public class Question10 {
	public static void HashToTree(String[] args) {
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Russia");
		h_set.add("Germany");
		h_set.add("Bolivia");
		h_set.add("Austria");
		System.out.println("the hash set1:" + h_set);

		HashSet<String> h_set2 = new HashSet<String>();
		h_set2.add("Russia");
		h_set2.add("Persia");
		h_set2.add("Bolovia");
		h_set2.add("Australia");
		System.out.println("the hash set2:" + h_set2);

		HashSet<String> result_set = new HashSet<String>();
		for (String element : h_set) {

			System.out.println(h_set2.contains(element) ? "Yes" : "No");
		}
	}
}