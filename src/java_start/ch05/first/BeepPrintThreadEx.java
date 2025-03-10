package java_start.ch05.first;

import java.awt.Toolkit;

public class BeepPrintThreadEx {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e){}
				}
			}
		});
		
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("12");
			try {Thread.sleep(500);}catch(Exception e){}
		}
		
	}

}
