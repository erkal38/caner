package selfStudy;

public class ElectricCarTest {

	public static void main(String[] args) {
     
		Tesla modelS=new Tesla("Model S",45000,"Grey");
		modelS.charge();
		modelS.drive();
		modelS.start();
	    System.out.println("**********************");
	    Ford fusion=new Ford("Kuka",20000,"grey",2015);
	    fusion.charge();
	    fusion.drive();
	    fusion.start();
	    System.out.println(fusion.toString());
	}
}
