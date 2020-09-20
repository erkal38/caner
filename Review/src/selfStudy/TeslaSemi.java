package selfStudy;

public class TeslaSemi extends ElectricTruck {
    private double  engineSize;
	public TeslaSemi(String model, double price, String color,double engineSize) {
		super(model, price, color);
		this.engineSize=engineSize;
	}

	@Override
	public void start() {
		System.out.println("TeslaSemi-start truck");
	}

	@Override
	public void charge() {
		System.out.println("TeslaSemi plugin charge");
	}

	@Override
	public void drive() {
        System.out.println("TeslaSemi is driving with load");
	}

	public double getEngineSize() {
		return engineSize;
	}
   
}
