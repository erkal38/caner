package selfStudy;

public class switchCase {

	public static void main(String[] args) {
         String weather="era";
         switch (weather) {
		  case "sunny" :
			  System.out.println("go to park");
			
			break;
		  case "hot":
			  System.out.println("stay at home");
			  break;
		  case "rainning":
			  System.out.println("get your raincoat");
			  break;

		default:
              System.out.println("Do not have any information about forecast");
         }
	}

}
