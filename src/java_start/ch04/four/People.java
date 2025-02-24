package java_start.ch04.four;

public class People {

	public static void main(String[] args) {
		
		
		Member member = new User();
		member.showMyName("김연용");
		
		System.out.println();	
		
		member = new Admin();
		member.showMyName("박진석");
		
		 Member[] members = new Member[2];
	     members[0] = new User();   // User 객체 할당
	     members[1] = new Admin();  // Admin 객체 할당

	        // 배열 순회
	        for (int i = 0; i < members.length; i++) {
	            members[i].showMyName("이름" + (i + 1));  
	        }
		
	}

}
