package basics;

public class NumCal {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("Total:" + printname(num));
		String booktitle = "This book is very nice";
		String tosearch= "book";
		if (booktitle.contains(tosearch)) {
			System.out.println("Found" + tosearch);
		}
		
	}

	static String printname(int numA) {
		String returnvalue = "ABC";
		System.out.println("My name is Tim");
		System.out.println("My number is:" + numA);
		String[] cities= {"CityA", "CityB", "CityC"};
		System.out.println(cities[2]);
		
		String[] area = new String[3];
		int i=0;
		do {
			System.out.println(i);
			i=i+1;
		} while (i<5);
	
		area [2] = "Area2";
		System.out.println(area[2]);
		
		return returnvalue;
	}
}
