package java_start.ch04.third;

public interface RemoteControl1 {

	void turnOn();
	
	
	
	public static void main(String[] args) {
		
		RemoteControl1 r = new Tv();
		r.turnOn();
		
		r = new Radio();
		r.turnOn();
		
		
	}
}
