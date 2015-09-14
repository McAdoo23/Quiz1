import java.util.Scanner;


public class QBRatings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Allowing user inputs
		
		System.out.print("Enter number of completions:");
		double Comp = input.nextDouble();
		//quaterback completions
		
		System.out.print("Enter number of Attempts:");
		double Att = input.nextDouble();
		//User enter attempted passes
		
		System.out.print("Enter number of interceptions:");
		double Ints = input.nextDouble();
		//total interceptions
		
		System.out.print("Enter number of Touchdowns:");
		double TD = input.nextDouble();
		//Number of Touchdowns
		
		System.out.print("Enter number of total yards:");
		double Yards = input.nextDouble();
		// Total Yards
		
		double a = (((Comp/Att)-.3)*5);
		//Calculating a
		double b = (((Yards/Att)-3)*(.25));
		//Calculating b
		double c = ((TD/Att)*(25));
		//Calculating c
		double d = (2.375 - (Ints/Att)*25);
		//Calculating d
		double QBrating = (((a + b + c + d)/6) * 100);
		//The QB rating equation
		System.out.printf("%10.2f", QBrating);
		//formatting to 2 decimal places and out putting answer

	}
}