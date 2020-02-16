package chap02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	
	private static List<Student1> list = Arrays.asList(
			new Student1("홍길동", 90, 96),
			new Student1("신용권", 95, 93)
			);
	
	public static void printString(Function<Student1, String> function) {
		for(Student1 student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student1> function) {
		for(Student1 student : list) {
			System.out.println(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString( t->t.getName());
		
		System.out.println("[영어 점수]");
		printInt( t->t.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt( t->t.getMathScore());
		
	}
}
