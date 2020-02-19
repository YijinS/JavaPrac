package chap04;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				
				);
		
		double avg = studentList.stream()
		.mapToInt(Student :: getScore) //중간처리(학생객체를 점수로 매핑)
		.average() //최종처리(평균점수)
		.getAsDouble();
		
		System.out.println(avg);
		

	}

}
