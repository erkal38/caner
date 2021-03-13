package techproed;

public class TernaryOperator {

	public static void main(String[] args) {
        int price=25;
        String variable="";
        variable=(price>10&&price<20)?"ok":(price==10?"cheap":"expensive");
        System.out.println(variable);
	}

}
