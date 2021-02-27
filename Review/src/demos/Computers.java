package demos;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String pname;
	int price;
	public Product(int id, String pname, int price) {
		this.id = id;
		this.pname = pname;
		this.price = price;
	}
}

public class Computers {

	public static void main(String[] args) {
       List<Product> proList=new ArrayList<Product>();
       
       proList.add(new Product(1, "HP",25000));
       proList.add(new Product(2, "Dell",35000));
       proList.add(new Product(3, "Asus",40000));
       proList.add(new Product(4, "Apple",50000));
	
       proList.stream().filter(p->p.price>25000).forEach(prL->System.out.println(prL.price));
	}

}
