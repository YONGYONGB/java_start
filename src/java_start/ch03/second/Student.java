package java_start.ch03.second;

public class Student extends People{
	
	int num;

	public Student(String name, String ssn, int num) {
		super(name, ssn);
		
		this.name = name;
		this.ssn =ssn;
		this.num = num;
	}
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	@Override
	void say() {
		System.out.printf("사랑해");
	}
	
}
