package chap02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	
	private static List<Student1> list = Arrays.asList(
			new Student1("ȫ�浿", 90, 96),
			new Student1("�ſ��", 95, 93)
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
		System.out.println("[�л� �̸�]");
		printString( t->t.getName());
		
		System.out.println("[���� ����]");
		printInt( t->t.getEnglishScore());
		
		System.out.println("[���� ����]");
		printInt( t->t.getMathScore());
		
	}
}
