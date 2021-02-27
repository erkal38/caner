package selfStudy1;

public class Person implements Comparable<Person>{
   
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
//        if(this.name.charAt(0)>o.name.charAt(0)) {
//        	return 1;
//        }else if(this.name.charAt(0)==o.name.charAt(0)) {
//        	return 0;
//        }else {
//		return -1;
//	}
	}
}
