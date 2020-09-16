package selfStudy1;

public class Calculator {
	int num1;
	int num2;
	public Calculator(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}

      public static double plus(double num1,double num2) {
    	  return num1+num2;
      }
      public static double minus(double num1,double num2) {
    	  return num1-num2;
      }
      public double multiply(double num1,double num2) {
    	  return num1*num2;
}
      public static void main(String[] args) {
          System.out.println(Calculator.plus(55, 4));
          System.out.println(Calculator.minus(55, 4));
          Calculator c=new Calculator(55,4);
          
         
      }
      }