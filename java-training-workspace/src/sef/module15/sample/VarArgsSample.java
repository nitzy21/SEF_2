package sef.module15.sample;

public class VarArgsSample {
	
	public static void main(String arg[]){
		listNames("John Doe", "Jane Doe", "Juan dela Cruz");
	}
	
	public static void listNames( String... names){
		//the parameter names is actually an array of Strings
		for (String i : names) {
			System.out.println(i);
		}
	}
}
