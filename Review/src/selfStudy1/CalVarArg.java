package selfStudy1;

public class CalVarArg {
	
	public static class Calculator{
		
			public void printAllArrayNumber(int...numbers) {
				for (int i = 0; i < numbers.length; i++) {
					System.out.print(numbers[i]+" ");
				}
			}
		}
	public static void main(String[] args) {
      Calculator cal=new Calculator();
      int[]nums= {2,3,77};
      cal.printAllArrayNumber(4,4,8);
	}

}

