package project.q10;

public class App {

	public static void main(String[] args) {
		double x = 3.14;
		
		//nesse caso os números após a virgula serão descartados
		int y = (int) x;
		
		//nesse caso o número será arredondado.
//		int y = (int) Math.round(x);
		System.out.println(y); 
	}
}
