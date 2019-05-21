package project.q6;

import project.q7.Big;

public class Father extends Man {
	public String getAge(String age) {
		boolean old = super.isOld(Integer.parseInt(age));
		if(old == true) {
			return "idoso";
		}
		return "jovem";
		}
	
	public static void main(String[] args) {	
		String result = new Father().getAge("80");
		System.out.println(result);
		Big a = new Big();
		a.name = "aaa";
		System.out.println(a.name);
	}
}
