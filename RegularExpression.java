import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	String patternString;
	String targetString = "Hello Faisal, We have your full\n" + 
			"name as Faisal Khan in our system. your contact number is 8754212512 .\n" + 
			"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	String[] stringToReplace = {"Faisal"," Khan"," 8754212512","01/01/2016"};
	String[] stringWithreplace = {"Imran"," Shaikh"," 9654123531","14/02/2020"};
	String[] validateString = {"^[A-Z]","[a-z]","[7-9][0-9]{9}","[\\d]{2}[/][\\d]{2}[/][\\d]{4}"};
	int iteration;
	
	public void checkMatch()
	{
		for(iteration = 0 ; iteration  < stringToReplace.length ; iteration++)
		{
			Pattern pattern = Pattern.compile(validateString[iteration]);
			Matcher match = pattern.matcher(targetString);
			while(true)
			{
				
				if(match.find())
				{
					System.out.println(match.start());
					targetString = targetString.replace(stringToReplace[iteration], stringWithreplace[iteration]);
					break;
				}
				else
				{
					System.out.println("Not present!!!!");
					break;
				}
			}
			System.out.println(targetString);
		}
		
	}	
	public static void main(String[] args) {
		RegularExpression exp = new RegularExpression();
		exp.checkMatch();
	}
}
