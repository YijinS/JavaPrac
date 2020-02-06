package chap02;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("ȫ�浿");
		String name = box1.get();
		System.out.println(name);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(1);
		int value = box2.get();
		System.out.println(value);
	}

}
