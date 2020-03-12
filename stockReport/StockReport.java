import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
class StockPortfolio{

	//VARIABLE.
	String name;
	long noOfShare;
	long sharePrice;
	double result;
	double totalAmount;

	//GIVEN JSON FILE PATH.
	final static String filePath = "/home/admin1/java_Programs/StockReport/src/Report.json";

	//METHOD FOR STOCK MANAGEMENT.
	void stockManagment() throws IOException, ParseException 
	{

		//TO READ THE FILE.
		FileReader fileReader = new FileReader(filePath);

		//TO TAKE FILEREADER OBJECT.
		BufferedReader buffredReader = new BufferedReader(fileReader);

		//TO READ THE JSON FILE IN JAVA.{
		JSONParser jsonParser = new JSONParser();
		//TO TAKE THE BUFFEREDREADER OBJECT.
		JSONObject jsonObject = (JSONObject)jsonParser.parse(buffredReader);

		//KEYS STRING.
		String [] keys = {"TCS","GODREJ","BAJAJ"};
		//FOR EACH ARRAY.
		for(int  arrayIteration = 0 ; arrayIteration < keys.length; arrayIteration++)
		{
			JSONArray array = (JSONArray)jsonObject.get(keys[arrayIteration]);

			//FOR ARRAY VALUE.
			for(int itr = 0 ; itr < keys.length-1 ; itr++)
			{	
				JSONObject array1 = (JSONObject)array.get(itr);
				System.out.println(array.get(itr)+" ");
				System.out.println();
				System.out.println("NAME :"+array1.get("name"));
				System.out.println("NO OF SHARE :"+array1.get("no of share"));
				System.out.println("SHARE PRICE:"+array1.get("share price"));
				noOfShare = (long)array1.get("no of share");
				sharePrice = (long)array1.get("share price");
				result = (long)noOfShare * sharePrice;
				System.out.println("Total value is : "+result);
				System.out.println();
				totalAmount = totalAmount + result;
			}
		
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("The total share amount is : "+totalAmount);
	}
}
public class StockReport {
	public static void main(String[] args) throws IOException, ParseException
	{
		StockPortfolio portfolio = new StockPortfolio();
		portfolio.stockManagment();
	}
}
