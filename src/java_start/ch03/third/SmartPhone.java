package java_start.ch03.third;

public class SmartPhone extends Phone{
	
	@Override
	public void sing() {
		System.out.println("메서드 오버라이딩을 강제해서 공통되게 씀");
	}
}
