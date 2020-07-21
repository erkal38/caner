package selfStudy1;

public class Neleman {

	public static void main(String[] args) {
    Solution(3);
	}
	public static int[] Solution(int N){

		int[] result = new int[N];

		int sum = 0;

		for(int i=0; i < N-1; i++) {

		result[i] =i;

		sum += i;

		}

		result[N-1] = -sum;

		return result;

		    }
}
