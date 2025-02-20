package java_start.ch03.second;

public class People {

	public String name;
	public String ssn;
	
	public People(String name, String ssn){
		this.name = name;
		this.ssn = ssn;	
	}
	
	void say() {
		System.out.printf("이름: %d이다",name);
	}
	
}
