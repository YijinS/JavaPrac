package chap03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		 list.add("java");
		 list.add("jdbc");
		 list.add("sevlet/jsp");
		 list.add(2, "database");
		 list.add("iBaits");
		 
		 int size = list.size();
		 System.out.println("�� ��ü�� : " + size);
		 System.out.println();
		 
		 String skill = list.get(2); //2��° �ε��� ��ü ���
		 System.out.println("2: "+skill);
		 System.out.println();
		 
		 for(int i=0; i<list.size(); i++) { //����� �� ������ŭ ����
			 String str = list.get(i);
			 System.out.println(i+":"+str);
		 }
		 System.out.println();
		 
		 list.remove(2);
		 list.remove(2);
		 list.remove("iBatis");
		 
		 for(int i=0; i<list.size(); i++) {
			 String str = list.get(i);
			 System.out.println(i+":"+str);
		 }

	}

}
