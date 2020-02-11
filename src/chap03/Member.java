package chap03;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name= name;
		this.age = age;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age; //name, age 값이 같으면 동일한 hashCode 리턴
	}
}
