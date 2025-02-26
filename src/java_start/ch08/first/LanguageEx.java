package java_start.ch08.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
	
		List<String> jinsuk17 = new ArrayList<>();
		
		System.out.println("test.size():" + jinsuk17.size());
		
		jinsuk17.add("진석1");
		jinsuk17.add("진석2");
		jinsuk17.add("진석3");
		jinsuk17.add("진석4");
		jinsuk17.add("진석5");
		jinsuk17.add("진석6");
		jinsuk17.add("진석7");
		jinsuk17.add("진석8");
		jinsuk17.add("진석9");
		jinsuk17.add("진석10");
		jinsuk17.add("진석11");
		System.out.println("test.size():" + jinsuk17.size());
		System.out.println(jinsuk17.get(0));
//		
////		test.remove(0);
//		System.out.println("test.size():" + test.size());
//		System.out.println(test.get(0));
		
		for(int i=0; i < jinsuk17.size(); i++) {
			if(jinsuk17.get(i).equals("진석5")) {
				jinsuk17.remove(1);
			}
			System.out.printf("test.get(%d):%s\n",i,jinsuk17.get(i));
		}
		System.out.println();
		
		
//		for(String jinsuk : jinsuk17) {
//			if(jinsuk.equals("진석5")) {
//				jinsuk17.remove(1);
//			}
//			System.out.println(jinsuk);
//		}
		
		
		
		
		
	}

}
