package selfStudy;

interface Downloadable {
  public void Downloadable();
}
interface Readable extends Downloadable{
	public void readBook();
}
abstract class Book implements Readable{
	public void readbook() {
		System.out.println("Read Book");
	}
}
 class Ebook extends Book{
	public void readBook() {
		System.out.println("Read E-book");
	}

	@Override
	public void Downloadable() {
		// TODO Auto-generated method stub
		
	}
}
