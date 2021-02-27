package demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String name;
	int score;

	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
  public static class ParallelStreams{
	  public static void main(String[] args) {
		List<Student>studentList=Arrays.asList(
				new Student("David",82),new Student("Bob",52),
				new Student("John",90),new Student("Eric",42),
				new Student("Smith",85),new Student("Scott",88)
				);
	//studentList.stream().filter(value->value.getScore()>80).forEach(action->System.out.println(action.getName()+" "+action.getScore()));
	studentList.parallelStream().filter(value->value.getScore()>80).forEach(action->System.out.println(action.getName()+" "+action.getScore()));
	  }
  }
}
