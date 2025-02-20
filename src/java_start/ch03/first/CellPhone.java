package java_start.ch03.first;

public class CellPhone {
	
	String model;
	String color;
	
	public CellPhone(String model,String color) {
		this.model = model;
		this.color = color;
	}
	
	public void powerOn(){
		System.out.printf("전원을 켭니다\n");
	}
	void powerOff(){System.out.printf("전원을 끕니다\n");}
	
	void message(String model, String color) {
		System.out.printf("%s가 %s보다 좋다",model,color);
	}
}
