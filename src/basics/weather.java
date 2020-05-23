package basics;

public class weather {
	public static void main (String[] args) {
		
		int temperature=85;
		
		if (temperature>80) {
			System.out.println("Please wear shortshirt");
	
		}
		else if (temperature < 60) {
			System.out.println("Please wear coat");
		}
		else {
			System.out.println("please wear nothing");
		}
			
		String whatday = "Monday";
		
		switch (whatday) {
		case "Monday": 
			System.out.println("Monday");
			break;
		case "Tuesday": 
			System.out.println("Tuesday");
			break;
		}
	}
}
