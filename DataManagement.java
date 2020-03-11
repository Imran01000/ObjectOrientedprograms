import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
		//String listArray = (String)jsonObject.get("RICE");
		System.out.println(jsonObject);
	}
}
