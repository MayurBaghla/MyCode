package StringRelated;

public class Substring {

	
	public static boolean isSubstring (String main, String sub) {
		
		return main.matches(".*"+ sub +".*");
		
		
	}
	public static void main(String[] args) {

		
		System.out.println(isSubstring("Mayur and Anshika", "X"));
		
	}

}
