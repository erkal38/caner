package selfStudy;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
        int[][] twoArray= {{1,2,3},{4,5},{7,8,9,6}};
        for(int i=0;i<twoArray.length;i++) {
        	for(int j=0;j<twoArray[i].length;j++) {
        		System.out.print(twoArray[i][j]);
        	
        	}
          System.out.println();
        }
	}

}
