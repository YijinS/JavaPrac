package chap02;

public class UsingLocalVariable {
	void method(int arg) {	//arg�� final �Ӽ��� ���´�
		int localVar = 40; //final
		
		MyFuntionalInterface3 fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar +"\n");
		};
			fi.method();
	}
}
