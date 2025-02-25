package java_start.ch06.third;

import java.awt.Toolkit;

public class TryEx{
	
	public static void main(String[] args) {
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		for(int i =0; i< 5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
}
