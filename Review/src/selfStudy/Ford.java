package selfStudy;

public class Ford extends ElectricCar{
	private int year;

	public Ford(String model, double price, String color,int year) {
		super(model, price, color);
        this.year=year;
	}

	

	public int getYear() {
		return year;
	}

	@Override
	public void start() {
     System.out.println("Ford is starting ");		
	}

	@Override
	public String toString() {
		return "Ford [year=" + year + "]";
	}



	@Override
	public void charge() {
        System.out.println("Ford is charging");		
	}

	@Override
	public void drive() {
     System.out.println("Ford is been driving by driver");		
	}

}
