package selfStudy1;

import java.util.Arrays;

class deneme {
public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(solution(A)));
	}

    public static int[] solution(int[] A) {
     		int[] B = { 0 };
		int j = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if ((A[(i + 1)] - A[i]) > 1) {
					B[j] = A[i] + 1;
					break;
					
			}else if((A[(i + 1)] - A[i])==1){
				B[j] = A[A.length - 1] + 1;
		}
}
		return B;
}   
    
}