package java_start.ch04.first;

public interface RemoteControl {

	public static final int MAX_VALUE = 10;
	int MIN_VOLUME = 0;
	final String name = "aa";
	
	//추상 메서드
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volumn);
}
