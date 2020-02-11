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
		 set.add("java"); //�ߺ� ��ü�� �� ���� ����ȴ�
		 set.add("iBaits");
		 
		 int size = set.size();
		 System.out.println("�� ��ü��: "+size);
		 
		 Iterator<String> iterator = set.iterator();
		 while(iterator.hasNext()) {
			 String element = iterator.next(); //�� ��ü�� �����´�
			 System.out.println("\t" + element);
		 }
		 System.out.println();
		 
		 set.remove("jdbc");
		 set.remove("iBatis");
		 
		iterator = set.iterator();
		 while(iterator.hasNext()) {
			 String element = iterator.next(); //�� ��ü�� �����´�
			 System.out.println("\t" + element);
		 }
		 
		 set.clear();
		 if(set.isEmpty()) {System.out.println("�������");}
		 

	}

}
