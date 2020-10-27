package addressbook;

	
	import java.util.ArrayList;
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
			   //	s1.close();
				//System.out.println(PersonArrayList);
		}

		@Override
		public void editPerson() {
			
		/*	for(int i=0;i<PersonArrayList.size();i++) {
			Scanner s2=new Scanner(System.in);
			String value=s2.nextLine();
			PersonArrayList.set(i,value);
				
		}
			*/
			
			
		}

		@Override
		public void deletePerson() {
			
			
		}

		@Override
		public void sortByName() {
			
			
		}

		@Override
		public void sortByZip() {
			
			
		}

		@Override
		public void searchPerson() {
			
			
		}

		@Override
		public void display() {
			
		}		
		
	}

