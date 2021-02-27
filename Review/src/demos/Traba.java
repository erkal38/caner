package demos;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

class Employee{
	String ename;
	int salary;
	
	Employee(String ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}
	
}

public class Traba {

	public static void main(String[] args) {
	   ArrayList<Employee>emplist= new ArrayList<Employee>();
	   emplist.add(new Employee("David",50000));
	   emplist.add(new Employee("John",30000));
	   emplist.add(new Employee("Mary",20000));
       Function<Employee,Integer> emp=e->{
    	                            int sal=e.salary;
                                    if(sal>=10000&&sal<=20000)
                                    	return(sal*10/100);
                                    else if(sal>20000&&sal<=30000)
                                    	return(sal*20/100);
                                    else if(sal>30000&&sal<=50000)
                                    	return(sal*30/100);
                                    else
                                    	return(sal*40/100);
       };
       Consumer<Employee>c=em->{
    	                        System.out.println(em.ename);
    	                        System.out.println(em.salary);
    	                        
       };
      for (Employee employee : emplist) {
        int bonus=emp.apply(employee);
        //System.out.println(employee.ename+" "+employee.salary);
        //System.out.println(employee.ename+"'s "+"bonus is "+ bonus);
        if(bonus>2000) {
        	c.accept(employee);
        	System.out.println("bonus "+bonus);
        }
    	  
      }   
	
	}
	}


