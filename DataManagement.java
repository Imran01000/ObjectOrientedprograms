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
	static double riceResult;
	static long riceRate;
	static long riceWeigth;
	static double pulseResult;
	static long pulseRate;
	static long pulseWeigth;
	static double wheatResult;
	static long wheatRate;
	static long wheatWeigth;
	
	//GIVEN JSON FILE PATH.
	final static String filePath = "/home/admin1/java_Programs/ProductList.json";
	
	//MAIN METHOD.
	public static void main(String[] args) throws IOException, ParseException
	{
		
		FileReader fileReader = new FileReader(filePath);
		BufferedReader buffredReader = new BufferedReader(fileReader);
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject)jsonParser.parse(buffredReader);
		
		//CREATING JSON ARRAY OBJECT TO FETCH EACH ARRAY FROM JSON FILE>
		JSONArray rice = (JSONArray)jsonObject.get("RICE");
		JSONArray pulse = (JSONArray)jsonObject.get("PULSES");
		JSONArray wheat = (JSONArray)jsonObject.get("WHEATS");

		//TO PRINT THE RICE ARRAY.
		for(int itr = 0 ; itr < rice.size() ; itr++)
		{
			//TO FETCH THE KEY VALUE FROM ARRAYOBJECT. 
			JSONObject riceArrayValue = (JSONObject)rice.get(itr);
			System.out.println(rice.get(itr)+" ");
			System.out.println();
			System.out.println("NAME :"+riceArrayValue.get("name"));
			System.out.println("WEIGTH :"+riceArrayValue.get("weigth"));
			System.out.println("PRICE PER KG:"+riceArrayValue.get("price per kg"));
			riceRate = (long)riceArrayValue.get("price per kg");
			riceWeigth = (long)riceArrayValue.get("weigth");
			riceResult =(long) riceRate * riceWeigth;
			System.out.println("Total value of rice is : "+riceResult);
			System.out.println();
		}
		System.out.println();
		for(int itr = 0 ; itr < pulse.size() ; itr++)
		{
			//TO FETCH THE KEY VALUE FROM ARRAYOBJECT. 
			JSONObject pulseArrayValue = (JSONObject)pulse.get(itr);
			System.out.println(pulse.get(itr)+" ");
			System.out.println();
			System.out.println("NAME :"+pulseArrayValue.get("name"));
			System.out.println("WEIGTH :"+pulseArrayValue.get("weigth"));
			System.out.println("PRICE PER KG:"+pulseArrayValue.get("price per kg"));
			pulseRate = (long)pulseArrayValue.get("price per kg");
			pulseWeigth = (long)pulseArrayValue.get("weigth");
			pulseResult =(long) pulseRate * pulseWeigth;
			System.out.println("Total value of rice is : "+pulseResult);
			System.out.println();
		}
		System.out.println();
		for(int itr = 0 ; itr < wheat.size() ; itr++)
		{
			//TO FETCH THE KEY VALUE FROM ARRAYOBJECT. 
			JSONObject wheatArrayValue = (JSONObject)wheat.get(itr);
			System.out.println(wheat.get(itr)+" ");
			System.out.println();
			System.out.println("NAME :"+wheatArrayValue.get("name"));
			System.out.println("WEIGTH :"+wheatArrayValue.get("weigth"));
			System.out.println("PRICE PER KG:"+wheatArrayValue.get("price per kg"));
			wheatRate = (long)wheatArrayValue.get("price per kg");
			wheatWeigth = (long)wheatArrayValue.get("weigth");
			wheatResult =(long) wheatRate * wheatWeigth;
			System.out.println("Total value of rice is : "+wheatResult);
			System.out.println();
		}
		
		
	}
}
