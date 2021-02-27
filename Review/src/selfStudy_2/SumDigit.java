package selfStudy_2;

public class SumDigit {

	public static void main(String[] args) {
       System.out.println(sumDigit("Ergun14567Kaldirim"));
	}

	public static Integer sumDigit(String string) {
		int total=0;
		char[] ch=string.toCharArray();
		System.out.println(ch); 
		for (char each : ch) {
			if(Character.isDigit(each)) {
				total +=Integer.parseInt(""+each);
			}
		}
		return total; 
	}
}
