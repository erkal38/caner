package demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Trabajador {
	String ename;
	int salary;
	int experience;

	Trabajador(String ename, int salary, int experience) {
		this.ename = ename;
		this.salary = salary;
		this.experience = experience;
	}

}

public class Trabajadores {
	public static void main(String[] args) {
		Trabajador trb = new Trabajador("Albert", 50000, 5);
		Predicate<Trabajador> pr = e -> (e.salary > 30000 && e.experience > 3);
		System.out.println(pr.test(trb));
		System.out.println(Arrays.asList(trb.ename, trb.salary, trb.experience));
		
		ArrayList<Trabajador>al=new ArrayList<Trabajador>();
		al.add(new Trabajador("Albert", 50000, 5));
		al.add(new Trabajador("John", 40000, 3));
		al.add(new Trabajador("Mike", 45000, 4));
		al.add(new Trabajador("Ozzy", 60000, 6));
	    for (Trabajador trabajador : al) {
			System.out.println(trabajador.ename+","+trabajador.salary+","+trabajador.experience);
		}
	}
}
