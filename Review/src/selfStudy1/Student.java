package selfStudy1;

public class Student {
	String name;
	int age;
   public Student(String name,int age) {
	   this.name=name;
	   this.age=age;
   }
	public static void main(String[] args) {
     Student s=new Student("ergun",40);
     System.out.println(s.name);
     System.out.println(s.age);
     
	}

}
