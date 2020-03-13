import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataManagement {
	//VARIABLES.
	double result;
	long rate;
	long weigth;
	int value;
	//GIVEN JSON FILE PATH.
	final static String filePath = "/home/admin1/java_Programs/ProductList.json";

	//METHOD FOR INVENTORY DATA MANAGEMENT.
	public void inventoryDataManagement( int value) throws IOException, ParseException
	{

		//TO READ THE FILE.
		FileReader fileReader = new FileReader(filePath);
		
		//TO TAKE FILEREADER OBJECT.
		BufferedReader buffredReader = new BufferedReader(fileReader);
		
		//TO READ THE JSON FILE IN JAVA.
		JSONParser jsonParser = new JSONParser();
		
		//TO TAKE THE BUFFEREDREADER OBJECT.
		JSONObject jsonObject = (JSONObject)jsonParser.parse(buffredReader);
		
		//KEYS STRING.
		String [] keys = {"RICE","PULSES","WHEATS"};
		
		//FOR EACH ARRAY.
		for(int  arrayIteration = 0 ; arrayIteration < keys.length; arrayIteration++)
		{
			if (arrayIteration+1 == value)
			{
				JSONArray array = (JSONArray)jsonObject.get(keys[arrayIteration]);
				
				//FOR ARRAY VALUE.
				for(int itr = 0 ; itr < keys.length-1 ; itr++)
				{	
					JSONObject array1 = (JSONObject)array.get(itr);
					System.out.println(array.get(itr)+" ");
					System.out.println();
					System.out.println("NAME :"+array1.get("name"));
					System.out.println("WEIGTH :"+array1.get("weigth"));
					System.out.println("PRICE PER KG:"+array1.get("price per kg"));
					rate = (long)array1.get("price per kg");
					weigth = (long)array1.get("weigth");
					result =(long)rate * weigth;
					System.out.println("Total value is : "+result);
					System.out.println();
				}
			}
		}
	}
	
	//MAIN METHOD.
	public static void main(String[] args) throws IOException, ParseException
	{
		DataManagement management = new DataManagement();
		management.inventoryDataManagement(management.value);
	}
}
