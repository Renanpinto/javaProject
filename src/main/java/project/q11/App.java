package project.q11;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		 double num = 1.999; 
		 BigDecimal x = BigDecimal.valueOf(num); 
		 x = x.setScale(2, BigDecimal.ROUND_DOWN);
		 System.out.print(x);
	}
}
