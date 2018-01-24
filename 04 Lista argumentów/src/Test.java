
public class Test {

	public static void main(String[] args) {
		
		System.out.println(srednia(2.5,2.5));
	}
	
	public static double srednia(double...is) {
		double srednia = 0;
		for(double x : is)
			srednia = srednia + x;		
		srednia = srednia/is.length;
		return srednia;
		
	}
}
