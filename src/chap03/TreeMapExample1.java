package chap03;

import java.io.ObjectInputStream.GetField;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(98), "ȫ�浿");
		scores.put(new Integer(97), "�̵���");
		scores.put(new Integer(45), "�ڱ��");
		scores.put(new Integer(65), "�ſ��");
		scores.put(new Integer(87), "���ڹ�");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ����  : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ����  : " + entry.getKey() + "-" + entry.getValue());
			
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95�� �Ʒ� ����  : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� ���� ����  : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����  : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85�� �̰ų� �ٷ� ���� ����  : " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(���� ��ü ��: " + scores.size() + ")");
		}
		


	}

}
