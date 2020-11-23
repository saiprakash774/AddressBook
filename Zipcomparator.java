package addressbook;

import java.util.Comparator;

public class Zipcomparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.zip, p2.zip);
	}
}
