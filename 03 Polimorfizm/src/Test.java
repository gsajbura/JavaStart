
public class Test {

	public static void main(String[] args) {
		Figura[] f = new Figura[5];
		f[0] = new Kwadrat();
		f[1] = new Tr�jk�t();
		f[2] = new Ko�o();
		f[0].a = 3;
		
		for(int i = 0; i<3; i++) {
			f[i].name();
		}
		
	}

}
