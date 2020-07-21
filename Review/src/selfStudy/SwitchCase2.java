package selfStudy;

public class SwitchCase2 {

	public static void main(String[] args) {
        char note='G';  
		switch (note) {
		case 'A':case'B':case'C':
			System.out.println("Note Value: "+"PASS");
			break;
		case 'D':case 'F':
			System.out.println("Note Value: "+"FAILED");
			break;
		default:
			System.out.println("Invalid note input");
			break;
		}
	}

}
