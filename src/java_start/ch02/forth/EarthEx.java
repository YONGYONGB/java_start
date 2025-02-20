package java_start.ch02.forth;

public class EarthEx {

	public static void main(String[] args) {
		
		
		
		System.out.printf("제일 높은 건물의 높이 %d입니다.\n", Earth.TOP_BUIDING);
		System.out.printf("제일 높은 산의 높이 %d입니다.\n", Earth.TOP_MOUNTAIN);
		
		
		Earth e = new Earth();
		
		
		System.out.println(e.getTopBuilding());
		e.setTopBuilding(20);
		System.out.println(e.getTopBuilding());
		
		
	}
}
