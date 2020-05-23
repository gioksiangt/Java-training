package basics;

class person {
	String name;
	String email;
	String phone;

	void walk() {
		System.out.println(name);
	}

}

public class demo {

	public static void main(String[] args) {
		person person1 = new person();
		person1.name = "joe";
		person1.email = "gmail";
		person1.phone = "123";
		person1.walk();

		/*
		 * // TODO Auto-generated method stub String name = "Tan AA "; String email=
		 * "giok@gmailcom"; String phone="123456789"; customer (name, email,phone);
		 * 
		 * }
		 * 
		 * static void customer(String name1, String email1, String newemail) {
		 * System.out.println("The details: "+ name1);
		 */
	}
}
