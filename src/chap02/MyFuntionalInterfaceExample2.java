package chap02;

public class MyFuntionalInterfaceExample2 {

	public static void main(String[] args) {
		MyFuntionalInterface2 fi;
		
		fi = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 3));
		
		fi = (x,y) -> {return x+ y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x,y) -> sum(x,y);
		System.out.println(fi.method(2, 5));
	}

	public static int sum(int x, int y) {
		// TODO Auto-generated method stub
		return (x+y);
	}

}
