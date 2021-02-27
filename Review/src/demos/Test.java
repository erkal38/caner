package demos;

@FunctionalInterface
interface Booking{
	public String bookCab(String source,String destination);
}
public class Test {

	public static void main(String[] args) {
        Booking cab=(source,destination)->{System.out.println("Ola cab is booked from "+source+" To "+destination);
        return("Price: 5000 Rs");};
        System.out.println(cab.bookCab("Turkey","Frankfurt"));
        
		
	}

}
