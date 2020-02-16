package chap02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	private static List<Student2> list = Arrays.asList(
			new Student2("ȫ�浿", "����", 90),
			new Student2("�����", "����", 98),
			new Student2("���ڹ�", "����", 60),
			new Student2("���ѳ�", "����", 34)
			);
	
	public static double avg(Predicate<Student2> predicate) {
		int count = 0, sum =0;
		for(Student2 student: list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t->t.getSex().equals("����"));
		System.out.println("���� ��� ����: " + maleAvg);
		
		double femaleAvg = avg(t->t.getSex().equals("����"));
		System.out.println("���� ��� ����: " + femaleAvg);

	}

}
