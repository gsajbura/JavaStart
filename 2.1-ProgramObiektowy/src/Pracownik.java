import java.util.Scanner;
public class Pracownik {
	private int age;
	private String name;
	Scanner ageScan = new Scanner(System.in);
	Scanner nameScan = new Scanner(System.in);
	public void setName() {
		System.out.println("Podaj imiê");
		name = nameScan.nextLine();
	}
	public void setAge() {
		System.out.println("Podaj wiek");
		age = nameScan.nextInt();
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
