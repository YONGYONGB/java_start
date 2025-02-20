package java_start.ch03.first;

public class DmbCellPhone extends CellPhone{

	public DmbCellPhone(String model, String color) {
		super(model, color);
	}
	@Override
	public void powerOn(){System.out.println("전원이 켜질뻔");}

	
}
