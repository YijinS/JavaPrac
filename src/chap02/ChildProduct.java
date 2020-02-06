package chap02;

public class ChildProduct<T, M, C> extends Product2<T, M> {
	private C company;
	public C getCompany() {return this.company;}
	public void setCompany(C company) {
		this.company = company;
	}
	
}
