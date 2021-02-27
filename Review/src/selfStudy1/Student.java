package selfStudy1;

public class Student {
	String name;
	int age;
	static String school;
   public Student(String name,int age,String school) {
	   this.name=name;
	   this.age=age;
	   this.school=school;
   }
	public static void main(String[] args) {
     Student s=new Student("ergun",40,"CybertekSchool");
     Student s1=new Student("ali",50,"Dedeman");
     System.out.println(s.name);
     System.out.println(s.age);
     System.out.println(s.school);
     System.out.println(s1.name);
     System.out.println(s1.age);
     System.out.println(s1.school);
     
	}

}
