package chap04;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("�ſ��", Member.MALE,20),
				new Member("�質��", Member.FEMALE,32),
				new Member("���̼�", Member.FEMALE, 25)
				
				);
		
		double ageAge = list.stream()
				.filter(m->m.getSex()==Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println("���� ��� ����: " + ageAge);

	}

}
