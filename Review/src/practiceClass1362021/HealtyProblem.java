package practiceClass1362021;

public class HealtyProblem {

	public static void main(String[] args) {
         /*
		 * Write a Java program that accepts name,surname, years, weight, height;
		 * Calculates BMI(Body Mass Index) and prints the user’s status like that;
		 * John CARPENTER is 25 years old, his height is 170.5 cm and his weight is 80.24 kg. He is HEALTHY because his BMI=24.7
		 * formula; bmi = weight / (height * height / 10000);
		 * bmi less than or equal 20 is weak,less than or equal 25 is healty,less than or equal 30 is fat, the other option is obese
		 */
		 
		 String name="John";
		 String surname="CARPENTER";
		 int years=25;
		 double height=170.5;
		 double weight=80.24;
		 double bmi=weight / (height * height / 10000);
		 
		 String status;
		 if(bmi<=20) {
			 status="weak";
		 }else if(bmi<=25) {
			 status="healty";
		 }else if(bmi<=30) {
			 status="fat";
		 }else
			 status="obese";
		 
       System.out.println(name + " " + surname + " is " + years + " years old ,his height is " + height
				+ " and his weight is " + weight + " He is " + status + " because his BMI=" + bmi);
	}

}
