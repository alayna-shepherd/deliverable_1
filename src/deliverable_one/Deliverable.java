package deliverable_one;

import java.util.Scanner;

public class Deliverable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String eventType;
int partySize;
String result;

	System.out.println("What type of event are you having: casual, semi-formal or formal?");
		Scanner scan = new Scanner(System.in);
		eventType = scan.nextLine();
		
	System.out.println("How many people will be there?");
		partySize = scan.nextInt();
		
		result = "Since you're hosting ";
		
		//determine event type and food	
	if ( eventType.equals("casual")) {
		result = result + "a casual event, for " + partySize + "people, you serve sandwiches ";
	}
	else if (eventType.equals("formal")) {
		result = result + "a formal event, for " + partySize +" people, you should serve chicken parmesan ";
	}
	else if (eventType.equals("semi-formal")) {
		result = result +"a semi-formal event, for " + partySize + "people,you should serve fried chicken ";
	}
		

	
	
		//determine size of party
	if (partySize == 1) {
		result = result + " prepared in the microwave.";
	}
	else if (partySize < 13) {
		result = result + " prepared in your kitchen.";
	}
	else if (partySize > 13) {
		result = result + " from a caterer.";
	}
				
	System.out.println(result);
				
	}

}
