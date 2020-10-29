package addressbook;

import java.util.Comparator;

public class Zipcomparator implements Comparator<Person> {
	public int compare(Person p1,Person p2) {
		return p1.zip.compareTo(p2.zip);
	}

}
