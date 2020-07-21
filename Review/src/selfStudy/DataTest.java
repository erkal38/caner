package selfStudy;

public class DataTest {

	public static void main(String[] args) {
         DatabaseManager manager=new DatabaseManager();
         manager.AddDatabase(new MongoDb());
         manager.AddDatabase(new MySql());
	}

}
class DatabaseManager{
	public void AddDatabase(IDatabase database) {
		database.add();
	
}
   public void DeleteDatabase(IDatabase database) {
	   database.delete();
   }
   public void GetDatabase(IDatabase database) {
	   database.get();
	   
   }
   public void UpdateDatabase(IDatabase database) {
	   database.update();
   }
}