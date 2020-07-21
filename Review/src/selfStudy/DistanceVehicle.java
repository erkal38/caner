package selfStudy;

public class DistanceVehicle {

	public static void main(String[] args) {
         System.out.println(distance(90,10));
         if(distance(90,10)>1500) {
        	 System.out.println("you spent so much gas");
         }else {
        	 System.out.println("it is normal");
         }
	}

	public static int distance(int speed, int time) {
		int result=speed*time;
		return result;
		
	}

}
