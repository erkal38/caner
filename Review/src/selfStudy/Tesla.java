package selfStudy;

public class Tesla extends ElectricCar{

	public Tesla(String model, double price, String color) {
		super(model, price, color);
	}

	@Override
	public void start() {
    System.out.println("Tesla is starting");		
	}

	@Override
	public void charge() {
    System.out.println("Tesla is charging");		
	}

	@Override
	public void drive() {
    System.out.println("Tesla is been driving");		
	}

}
