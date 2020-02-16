package chap02;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	
	private static List<Student1> list = Arrays.asList(
			new Student1("ȫ�浿", 90, 96),
			new Student1("�ſ��", 95, 93)
			);
	
	public static double avg( ToIntFunction<Student1> function) {
		int sum =0;
		for(Student1 student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum/list.size();
		
		return avg;
		
	}
	
	
	public static void main(String[] args) {
		double englishAvg = avg(s->s.getEnglishScore());
		System.out.println("���� ��� ����: " + englishAvg);
		
		double mathAvg = avg(s->s.getMathScore());
		System.out.println("���� ��� ����: " + mathAvg);

	}

}
