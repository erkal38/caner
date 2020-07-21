package selfStudy;

public class MySql implements IDatabase {

	@Override
	public void add() {
       System.out.println("Mysql Ekleme");		
	}

	@Override
	public void delete() {
          System.out.println("Mysql silme");
	}

	@Override
	public void get() {
          System.out.println("Mysql Alma");
          
	}

	@Override
	public void update() {
        System.out.println("Mysql güncelleme");		
	}
  
}
