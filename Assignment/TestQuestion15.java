package Assignment;

import java.util.LinkedList;

public class TestQuestion15 {
	public static void main(String[] args) {
		LinkedList<String> Swaplist = new LinkedList<String>();
		Swaplist.add("USA");
		Swaplist.add("JAPAN");
		Swaplist.add("CHINA");
		Swaplist.add("INDIA");
		
		Question15 swapper = new Question15();
		swapper.swap(Swaplist);
	}
}
