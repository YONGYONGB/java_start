package java_start.ch02.third;

public class ArithmecitEX {
		
	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		
		System.out.println(a+b);
		System.out.printf("a + b = %d", a,b,a+b);
		
		System.out.println();
		
		
		Arithmetic ari = new Arithmetic(a,b);
		
		ari.sum(a, b);
		
	}
	
}
