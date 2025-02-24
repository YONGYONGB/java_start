package java_start.ch04.four;

public class User implements Member {
	
	String name = "";
	@Override
	public void showMyName(String name) {
		System.out.printf("내 이름은 User.%s",name);			
	}

	
}
