package selfStudy;

public class MongoDb implements IDatabase{

	@Override
	public void add() {
		System.out.println("MongoDb Ekleme");	
		
	}

	@Override
	public void delete() {
		System.out.println("MongoDb silme");
		
	}

	@Override
	public void get() {
		System.out.println("MongoDb alma");
		
	}

	@Override
	public void update() {
		System.out.println("MongoDb güncelleme");
		
	}

}

