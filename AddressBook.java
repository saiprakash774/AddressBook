package addressbook;

import java.io.*;
import java.util.*;

public class AddressBook implements InAddressBook {
	ArrayList<Person> PersonArrayList;

	public AddressBook() {
		PersonArrayList = new ArrayList<>();
	}

	public void addPerson() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter firstname of the person: ");
		String firstname = s1.nextLine();
		System.out.println("Enter lastname of the person: ");
		String lastname = s1.nextLine();
		System.out.println("Enter the city name of the person:");
		String city = s1.nextLine();
		System.out.println("Enter the state of the person");
		String state = s1.nextLine();
		System.out.println("Enter phone number of the person");
		long phone = s1.nextLong();
		System.out.println("Ente the zip code of the person");
		int zip = s1.nextInt();
		Person person = new Person(firstname, lastname, city, state, phone, zip);
		PersonArrayList.add(person);
	}

	Scanner s2 = new Scanner(System.in);

	public void editPerson() {
		int num = 0;
		System.out.println("Enter phone number  of a person to edit details:");
		long phone_num = s2.nextLong();
		for (Person person : PersonArrayList) {
			if (phone_num == (person.phone)) {
				while (num == 0) {
					System.out.println("Enter an option to edit:\n" + "1.phone number\n" + "2.address\n" + "3.quit");
					int value = s2.nextInt();
					Scanner s3 = new Scanner(System.in);
					switch (value) {
					case 1:
						System.out.println("Enter new phonenumber: ");
						long phonenumber = s3.nextLong();
						person.setPhone(phonenumber);
						System.out.println(person.toString());
						break;
					case 2:
						System.out.println("Enter new city: ");
						String city = s3.nextLine();
						person.setCity(city);
						System.out.println("Enter new state:");
						String state = s3.nextLine();
						person.setState(state);
						System.out.println("Enter new zip code:");
						int zip = s3.nextInt();
						person.setZip(zip);
						break;
					case 3:
						num = 1;
						break;
					default:
						System.out.println("wrong option entered");
						break;
					}

				}
			}
		}

	}

	Scanner s3 = new Scanner(System.in);

	public void deletePerson() {
		int num = 1;
		System.out.println("Enter phone number of a person to delete person:");
		long phone_num = s3.nextLong();
		for (Person person : PersonArrayList) {
			if (phone_num == (person.phone)) {
				Scanner s4 = new Scanner(System.in);
				System.out.println("enter 1 to confirm delete: ");
				int confirmation = s4.nextInt();
				if (confirmation == 1) {
					PersonArrayList.remove(person);
					break;
				} else
					break;
			}

			else
				System.out.println("Not found ");
		}
	}

	public void sortByName() {
		Collections.sort(PersonArrayList, new Namecomparator());
		System.out.println("Sorted by Name of a Person");
		for (Person person : PersonArrayList) {
			System.out.println(person.toString());
		}
	}

	@Override
	public void sortByZip() {
		Collections.sort(PersonArrayList, new Zipcomparator());
		System.out.println("Sorted by zipcode of a Person");
		for (Person person : PersonArrayList) {
			System.out.println(person.toString());
		}
	}

	Scanner s4 = new Scanner(System.in);

	public void searchPerson() {
		System.out.println("Enter phone number of a person to search");
		String name = s4.nextLine();
		for (Person person : PersonArrayList) {
			if (name.equals(person.phone)) {

				System.out.println("person found");
				System.out.println(person.toString());
			}
		}
	}

	@Override
	public void display() {
		for (Person person : PersonArrayList) {
			System.out.println(person.toString());
		}
	}

	public void writeToFile() {
		File file = new File("D:\\javacsvfiles");
		String[] filenamesD = file.list();
		if (filenamesD == null)
			System.out.println("File with the name does not exists");
		else {
			for (int i = 0; i < filenamesD.length; i++) {
				String filename = filenamesD[i];
				System.out.println(filename);
			}
		}
		System.out.println("Enter the file name, data to be saved in: ");
		Scanner input = new Scanner(System.in);
		String filename = input.nextLine();
		BufferedReader filereader = null;
		try {
			filereader = new BufferedReader(new FileReader("D:\\javacsvfiles\\" + filename + ".csv"));
			String line = "";

			while ((line = filereader.readLine()) != null) {
				for (Person cell : PersonArrayList) {
					System.out.print(cell + "\t");
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.print(e);
		}
		try {
			filereader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		FileWriter file_writer = null;
		BufferedWriter filebuffer = null;
		PrintWriter fileprinter = null;
		try {
			file_writer = new FileWriter("D:\\javacsvfiles\\" + filename + ".csv", true);
			filebuffer = new BufferedWriter(file_writer);
			fileprinter = new PrintWriter(filebuffer);
			for (Person cell : PersonArrayList) {
				fileprinter.print(cell.getFirstName());
				fileprinter.print(",");
				fileprinter.print(cell.getLastName());
				fileprinter.print(",");
				fileprinter.print(cell.getPhone());
				fileprinter.print(",");
				fileprinter.print(cell.getZip());
				fileprinter.print(",");
				fileprinter.print(cell.getCity());
				fileprinter.print(",");
				fileprinter.print(cell.getState());
				fileprinter.print(",");
				fileprinter.println();
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				file_writer.flush();
				filebuffer.flush();
				fileprinter.flush();
				file_writer.close();
				filebuffer.close();
				fileprinter.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
