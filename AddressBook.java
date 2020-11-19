package addressbook;

	
	import java.util.*;




	public class AddressBook implements InAddressBook {
		
		ArrayList<Person> PersonArrayList;
		
		
		public AddressBook() {
			  PersonArrayList = new ArrayList<>();
			}

		
			public void addPerson()
			{
				Scanner s1=new Scanner(System.in);
				System.out.println("Enter firstname of the person: ");
				String firstname=s1.nextLine();
				System.out.println("Enter lastname of the person: ");
				String lastname=s1.nextLine();
				System.out.println("Enter the city name of the person:");
				String city=s1.nextLine();
				System.out.println("Enter the state of the person");
				String state=s1.nextLine();
				System.out.println("Enter phone number of the person");
				String phone=s1.nextLine();
				System.out.println("Ente the zip code of the person");
				String zip=s1.nextLine();
				
				
				Person person = new Person( firstname,lastname, city,state, phone, zip);
			    PersonArrayList.add(person);
		}

			 Scanner s2=new Scanner(System.in);
		public void editPerson() {
			 int num=0;
			 System.out.println("Enter firstname of a person to edit details:");
			 String name=s2.nextLine();
			 for(Person person : PersonArrayList)
			 {
			if(name.equals(person.firstName)) {
			
			while(num==0) {		
			System.out.println("Enter an option to edit:\n"
					+"1.phone number\n"
					+"2.address\n"
					+"3.quit");
			int value=s2.nextInt();
			 Scanner s3=new Scanner(System.in);
			switch(value) {
			case 1:
						System.out.println("Enter new phonenumber: ");
						String phonenumber=s3.nextLine();
						person.setPhone(phonenumber);
						System.out.println(person.toString());
						break;
			case 2:
						
						System.out.println("Enter new city: ");
						String city=s3.nextLine();
						person.setCity(city);
						System.out.println("Enter new state:");
						String state=s3.nextLine();
						person.setState(state);
						System.out.println("Enter new zip code:");
						String  zip=s3.nextLine();
						person.setZip(zip);
						break;
			case 3:  
						num=1;
						break;
		   default:
						System.out.println("wrong option entered");
						break;
			}
			
			}
			 }
			 }			 
			
			
		}

		Scanner s3=new Scanner(System.in);
		public void deletePerson() {
			int num=1;
			System.out.println("Enter phone number of a person to delete person:");
			String name=s3.nextLine();
			for(Person person : PersonArrayList)
			{	 
						if(name.equals(person.phone)) 
						{
							Scanner s4=new Scanner(System.in);
							System.out.println("enter 1 to confirm delete: ");
							int confirmation=s4.nextInt();
							if(confirmation==1) 
							{
									PersonArrayList.remove(person);
									break;
							}
							else
									break;
						} 
						
						else
						{
							System.out.println("Not found ");
						}
			}
			
			
		}
		
		public void sortByName() {
			
			Collections.sort(PersonArrayList, new Namecomparator());
			System.out.println("Sorted by Name of a Person");
			for(Person person : PersonArrayList) {
				System.out.println(person.toString());
			}
			
		}

		@Override
		public void sortByZip() {
			Collections.sort(PersonArrayList, new Zipcomparator());
			System.out.println("Sorted by zipcode of a Person");
			for(Person person : PersonArrayList) {
				System.out.println(person.toString());
			}
			
		}

		Scanner s4=new Scanner(System.in);
		public void searchPerson() {
			System.out.println("Enter phone number of a person to search");
			String name=s4.nextLine();
			 for(Person person : PersonArrayList) {
			if(name.equals(person.phone)) {
				
				System.out.println("person found");
				System.out.println(person.toString());	
			}		

			}	
		}

		@Override
		public void display() {
			for(Person person : PersonArrayList) {
				System.out.println(person.toString());
			}
		}		
		
	}

