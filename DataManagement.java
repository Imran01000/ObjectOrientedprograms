import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataManagement {
	final static String filePath = "/home/admin1/java_Programs/ProductList.json";
	public static void main(String[] args) throws IOException, ParseException
	{
		
		FileReader fileReader = new FileReader(filePath);
		BufferedReader buffredReader = new BufferedReader(fileReader);
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject)jsonParser.parse(buffredReader);
		JSONArray rice = (JSONArray)jsonObject.get("RICE");
		JSONArray pulse = (JSONArray)jsonObject.get("PULSES");
		JSONArray wheat = (JSONArray)jsonObject.get("WHEATS");
		for(int itr = 0 ; itr < rice.size() ; itr++)
		{
			System.out.println(rice.get(itr)+" ");
		}
		System.out.println();
		for(int itr = 0 ; itr < pulse.size() ; itr++)
		{
			System.out.println(pulse.get(itr)+" ");
		}
		System.out.println();
		for(int itr = 0 ; itr < wheat.size() ; itr++)
		{
			System.out.println(wheat.get(itr)+" ");
		}
		
		
	
	}
}
