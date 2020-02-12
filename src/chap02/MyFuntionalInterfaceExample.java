package chap02;

public class MyFuntionalInterfaceExample {

	public static void main(String[] args) {
		MyFuntionalInterface fi;
		
		fi = (x) -> {
			//String str = "method call1";
			int result = x * 5;
			
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) ->{System.out.println(x*5);};
		
		fi.method(3);
		
		fi = (x) ->System.out.println(x*5);
		fi.method(4);
		
	}

}
