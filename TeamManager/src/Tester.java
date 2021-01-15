/*
 * 01.16.2020
 * In-Class Example
 */

public class Tester {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Bob");
		System.out.println(p.getName());
		Person p1 = new Person("JJ");
		System.out.println(p.getName());
		System.out.println(p1.getName());
		
		TeamManager tm = new TeamManager();
		tm.add(p1);
		tm.add(new Student());

	}

}
