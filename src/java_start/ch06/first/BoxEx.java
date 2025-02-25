package java_start.ch06.first;

public class BoxEx {
	public static void main(String[] args) {
		
		Box<Integer> b = new Box<>(); 
		b.setT(1);
		System.out.println(b.getT());
	}
}
