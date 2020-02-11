package chap03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		 set.add("java");
		 set.add("jdbc");
		 set.add("sevlet/jsp");
		 set.add("java"); //중복 객체는 한 번만 저장된다
		 set.add("iBaits");
		 
		 int size = set.size();
		 System.out.println("총 객체수: "+size);
		 
		 Iterator<String> iterator = set.iterator();
		 while(iterator.hasNext()) {
			 String element = iterator.next(); //한 객체를 가져온다
			 System.out.println("\t" + element);
		 }
		 System.out.println();
		 
		 set.remove("jdbc");
		 set.remove("iBatis");
		 
		iterator = set.iterator();
		 while(iterator.hasNext()) {
			 String element = iterator.next(); //한 객체를 가져온다
			 System.out.println("\t" + element);
		 }
		 
		 set.clear();
		 if(set.isEmpty()) {System.out.println("비어있음");}
		 

	}

}
