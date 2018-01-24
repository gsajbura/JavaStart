import java.util.Scanner;

public class Ko³o {
	private double promieñ;
	
	public void setPromieñ() {
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Podaj promieñ ko³a");
			promieñ = in.nextDouble();
			if (promieñ<=0) {
				System.out.println("Promieñ ko³a musi byæ wiêkszy od 0");
			} 
		} while (promieñ<=0);
		in.close();

	}
		
	public void obliczObwód() {
		System.out.println("Obwód ko³a o promieniu " + promieñ + " wynosi: " + 2*Math.PI*promieñ);
	}
}