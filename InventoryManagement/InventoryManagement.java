import java.io.IOException;
import java.util.Scanner;
import org.json.simple.parser.ParseException;

public class InventoryManagement extends DataManagement {
	
	int choice;
	DataManagement data = new DataManagement();
	public void inventoryManagement() throws IOException, ParseException 
	{	Scanner sc = new Scanner(System.in);
		System.out.printf("Enter your choice\n1.Rice\n2.pulses\n3.wheat\n");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			data.inventoryDataManagement(1);
			break;
			
		case 2:
			data.inventoryDataManagement(2);
			break;
			
		case 3:
			data.inventoryDataManagement(3);
			break;
			
		default:
			System.out.println("Invalid input");
		}
	}
	public static void main(String[] args) throws IOException, ParseException
	{
		InventoryManagement management = new InventoryManagement();
		management.inventoryManagement();
		
		
	}
	
}
