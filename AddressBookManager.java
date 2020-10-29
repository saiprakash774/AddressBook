package addressbook;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AddressBookManager implements InAddressBookManager {


		//@SuppressWarnings("resource")
		public void newAddressBook()
		
		
		{
			System.out.println("Create new Address Book: ");
			
			Scanner s=new Scanner(System.in);
			String addressbookname=s.nextLine();
			
			try {
				
				FileWriter fw = new FileWriter("D:\\CSV.csv",true);
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);
				pw.println("Name of the address book: "+addressbookname );
				pw.flush();
				pw.close();
				JOptionPane.showMessageDialog(null,"Record saved");
			}
			
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Record not saved");	
			}
			
			
			
		s.close();
		}

		@Override
		public void openAddressBook() {
		
			AddressBook addressbook = new AddressBook();
			
			Scanner s1=new Scanner(System.in);
	
			int value=1;
	
	
		
		while (value==1)
		{
		System.out.println("Enter one of the following option to perform oeration on Address: ");
		System.out.println("1.Add person");
		System.out.println("2.edit person");
		System.out.println("3.delete person");
		System.out.println("4.Sort By name");
		System.out.println("5.Sort By Zip");
		System.out.println("6.Search person");
		System.out.println("7.Display");
		System.out.println("8.Quit");
		
		s1 = new Scanner(System.in);
		int num =s1.nextInt();
		switch (num) {
						case 1:
								addressbook.addPerson();
								break;
								
						case 2:
								addressbook.editPerson();
								break;
						case 3:
								addressbook.deletePerson();
								break;
				
						case 4:
								addressbook.sortByName();
								break;
			   
						case 5:
								addressbook.sortByZip();
								break;
				
						case 6:
								addressbook.searchPerson();
								break;	
						case 7:
								addressbook.display();
								break;
						case 8:
								value=0;
				
					   default :
								System.out.println("Entered Wrong option");
		
		}
						
		}		
						
			//	s1.close();
	}

		@Override
		public void saveAddressBook() {
			
			
		}

		@Override
		public void saveAsAddressBook() {

			
		}

		@Override
		public void closeAddressBook() {
			
			
		}

}
