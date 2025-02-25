package java_start.ch06.second;

public class ProductEx {

	public static void main(String[] args) {
		
		
		Product<String, Integer> gall24 = new Product<>();
		
		gall24.setProduct("24");
		System.out.println(gall24.getProduct());
		gall24.setModel(24);
		System.out.println(gall24.getModel());
		
		Product<Car, Tv> gall = new Product<>();
		
		Tv t = new Tv();
		
		gall.setModel(t);
		System.out.println(gall.getModel());
	}

}
