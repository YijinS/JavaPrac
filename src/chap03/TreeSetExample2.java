package chap03;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(76));
		scores.add(new Integer(45));
		scores.add(new Integer(57));
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet ) {
			System.out.println(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet(); //오름차순
		for(Integer score : ascendingSet) {
			System.out.println(score + " ");
		}
		
	}
}
