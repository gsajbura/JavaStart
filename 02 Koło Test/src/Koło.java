import java.util.Scanner;

public class Ko�o {
	private double promie�;
	
	public void setPromie�() {
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Podaj promie� ko�a");
			promie� = in.nextDouble();
			if (promie�<=0) {
				System.out.println("Promie� ko�a musi by� wi�kszy od 0");
			} 
		} while (promie�<=0);
		in.close();

	}
		
	public void obliczObw�d() {
		System.out.println("Obw�d ko�a o promieniu " + promie� + " wynosi: " + 2*Math.PI*promie�);
	}
}