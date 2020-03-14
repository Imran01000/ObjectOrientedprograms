
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	String patternString;
	String targetString = "Hello Faisal,  We have your full name as Faisal Khan in our system. your contact number is 8754212512";
	String[] stringToReplace = {"Faisal","Faisal Khan"};
	String[] stringWithreplace = {"Imran","Imran Shaikh"};
	int iteration;
	
	public void checkMatch()
	{
		for(iteration = 0 ; iteration  < stringToReplace.length ; iteration++)
		{
			Pattern pattern = Pattern.compile(stringToReplace[iteration]);
			Matcher match = pattern.matcher(targetString);
			while(true)
			{
				if(match.find())
				{
					System.out.println("Faisal present at ----> "+match.start());
					targetString = targetString.replace(stringToReplace[iteration], stringWithreplace[iteration]);
					break;
				}
				else
				{
					System.out.println("Not present!!!!");
					break;
				}
			}
		}
		System.out.println(targetString);
	}	
	public static void main(String[] args) {
		RegularExpression exp = new RegularExpression();
		exp.checkMatch();
	}
}
