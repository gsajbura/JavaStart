import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Kwestionariusz {
//TEST                                                       
	public static void main(String[] args) throws FileNotFoundException{           
		Scanner in = new Scanner(System.in);           
		System.out.println("Podaj swoje imiê:\t");     
		String name = in.nextLine();                   
		System.out.println("Podaj swój wiek:\t");     
		int age = in.nextInt();                   
		System.out.println("Twoje imiê to:\t" + name); 
		System.out.println("Twój wiek to:\t" + age); 
		PrintWriter zapis = new PrintWriter("ala.txt");
		zapis.println(name);
		zapis.println(age);
		zapis.close();
		in.close();
	}                                                  
                                                       
}                                                      
                                                       
