package demos;

public class DivideWithoutOp {

	public static void main(String[] args) {
        System.out.println(div(100,8));
	}

	public static int div(int i, int j) {
  		System.out.println(i+" divide by "+j+" is:");
  		int count=0;
  		while(i>=j) {
  			i-=j;
  			count++;
  		}
		return count;
	}

}
