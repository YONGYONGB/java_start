package java_start.ch02.third;

public class ArithmecitEX {
	
	
	static void plus(int a, int b) {
		int c = a+ b;
		System.out.println(c);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		
		System.out.println(a+b);
		System.out.printf("a + b = %d", a,b,a+b);
		
		System.out.println();
		
		plus(a,b);
		
		
		Arithmetic ari = new Arithmetic(a,b);
		
		ari.sum(a, b);
		
	}
	
}
