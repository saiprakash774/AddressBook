package addressbook;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class AddressBookManager implements InAddressBookManager 
{
	public String filename;
	public void newAddressBook()
	{
		System.out.println("Enter name of AddressBook: ");
			Scanner addressbookname=new Scanner(System.in);
			filename=addressbookname.nextLine();
			try
			{
				File file= new File("D:\\javacsvfiles\\"+filename+".csv");
				if(file.createNewFile()) 
				{
					System.out.println("AddressBook Created");
				}
				else 
				{
					System.out.println("AddressBook Name already exists");
				}
				
			}catch(Exception e)
			{
					System.out.println(e);
			}
			
	} 
	public void openAddressBook()
	{
		AddressBook addressbook = new AddressBook();
		Scanner s1=new Scanner(System.in);
		Scanner addressbookobj=new Scanner(System.in);	
		File file=new File("D:\\javacsvfiles");
		String[] filenames=file.list();
		if(filenames==null) {
			System.out.println("File with name does not exists");
		}
		else {
			for(int i=0;i<filenames.length;i++) {
				String filename=filenames[i];
				System.out.println(filename);
			}
		}
		System.out.println("Enter name of AddressBook to open: ");
		String addressbookname=addressbookobj.next();
		for(int i=0;i<filenames.length;i++) {
			String filename=filenames[i];
			System.out.println(filename);
		if(addressbookname.equalsIgnoreCase(filename)) {
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
			switch (num) 
			{
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
		}
		else
			System.out.println("addressbook name not found:");
		}
		}

		public void saveAddressBook()
		{
		
		}
		public void saveAsAddressBook() 
		{
			
		}
		public void closeAddressBook() 
		{
				
		}
}