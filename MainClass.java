package addressbook;
import java.util.Scanner;
public class MainClass {

	private static Scanner s;

	public static void main(String[] args) {
	
		
		
		AddressBookManager addressbookmanager =new AddressBookManager();
		int value=1;
		
		
			
			while (value==1)
			{
			System.out.println("Enter one of the following option to perform oeration on Address: ");
			System.out.println("1.New Address Book");
			System.out.println("2.Open Address Book");
			System.out.println("3.Save Address Book");
			System.out.println("4.Saveas Address Book");
			System.out.println("5.Close Address Book");
			System.out.println("6.Quit");
			s = new Scanner(System.in);
			
			int num =s.nextInt();
			switch (num) {
			case 1:
					addressbookmanager.newAddressBook();
					break;
						
			case 2:
					addressbookmanager.openAddressBook();
					break;
					
			case 3:
					addressbookmanager.saveAddressBook();
					break;
				   
			case 4:
					addressbookmanager.saveAsAddressBook();
					break;
					
			case 5:
					addressbookmanager.closeAddressBook();
					break;	
			case 6:
					value=0;
					break;
			default :
						System.out.println("Entered Wrong option");
						break;
			}
			
			 
			}
		}

	}


