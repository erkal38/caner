package selfStudy;

public class VarArgs {

	public static void main(String[] args) {
      sum(2,4);
      sum(2,5,13,45);
      sum(13,200,50);
      
	}

	public static void sum(int...numbers) {
       int sum=0;
       for (int value : numbers) {
		 sum+=value;
	}
		System.out.println(sum);
	}

}
