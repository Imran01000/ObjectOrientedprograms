import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	String patternString;
	String targetString = "Hello Faisal, We have your full\n" + 
			"name as Faisal Shaikh in our system. your contact number is 8754212512.\n" + 
			"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	public void checkMatch()
	{

		Pattern pattern = Pattern.compile("^[0-9] {10}");
		Matcher match = pattern.matcher(targetString);
		while(true)
		{
			if(match.find())
			{
				System.out.println("Validate number!!!");
				break;
			}
			else
			{
				System.out.println("Not validate number dear!!!!");
				break;
			}
		}

	}	
	public static void main(String[] args) {
		RegularExpression exp = new RegularExpression();
		exp.checkMatch();
	}
}
