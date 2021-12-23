/*
*
* @author Sergey Shchukin
* @version 23.12.2021
*
*
*/

import java.util.Arrays;

class FiveLesson {
	public static void main(String[] args) {
		//Person person1 = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", "30000", 30);
		//System.out.println(person1);
		//Person person2 = new Person("Ivanov Petr", "Engineer", "ivpetr@mailbox.com", "892313636", "40000", 45);
		//System.out.println(person2);
		//Person person3 = new Person("Ivanov Maxim", "Engineer", "ivmaxim@mailbox.com", "8923134343", "50000", 50);
		//System.out.println(person3);
		//Person person4 = new Person("Ivanov Nikolay", "Engineer", "ivnikolay@mailbox.com", "89231231212", "100000" , 29);
		//System.out.println(person4);
		//Person person5 = new Person("Ivanov Sergey", "Engineer", "ivsergey@mailbox.com", "892311010", "20000", 40);
		//System.out.println(person5);


// array

		Person[] persArray = new Person[5];
		persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", "30000", 30);
		persArray[1] = new Person("Ivanov Petr", "Engineer", "ivpetr@mailbox.com", "892313636", "40000", 45);
		persArray[2] = new Person("Ivanov Maxim", "Engineer", "ivmaxim@mailbox.com", "8923134343", "50000", 50);
		persArray[3] = new Person("Ivanov Nikolay", "Engineer", "ivnikolay@mailbox.com", "89231231212", "100000", 29);
		persArray[4] = new Person("Ivanov Sergey", "Engineer", "ivsergey@mailbox.com", "892311010", "20000", 40);
		for (int i = 0; i < persArray.length; i++) {
			if (persArray[i].getAge() > 40) {
				persArray[i].toString();
			}
		}
	}
}

class Person {
	private String name;
	private String position;
	private String email;
	private String phone;
	private String money;
	private int age;


	Person(String name, String position, String email, String phone, String money, int age) {
		this.name = name;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.money = money;
		this.age = age;
	}

	Person() {

	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + ", " + position + ", " + email + ", " +phone + ", " + money + ", " + age;
	}

}
