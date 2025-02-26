package java_start.ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashsetEx {

	public static void main(String[] args) {
		
		Set<String> computer = new HashSet<>();
		
		computer.add("진석1");
		computer.add("진석2");
		computer.add("진석3");
		computer.add("진석4");
		computer.add("진석5");
		computer.add("진석6");
		computer.add("진석1");
		computer.add("진석1");
		
		System.out.println(computer.size());
	}

}
