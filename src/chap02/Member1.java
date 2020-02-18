package chap02;

public class Member1 {

	private String name;
	private String id;
	
	public Member1() {
		System.out.println("member1() 실행");
	}
	
	public Member1(String id) {
		System.out.println("member(string id) 실행");
		this.id = id;
	}
	
	public Member1(String name, String id) {
		System.out.println("Member1(String name, String id) 실행");
		this.id = id;
		this.name = name;
		
	}

	public String getId() {
		return id;
	}
	
	
}
