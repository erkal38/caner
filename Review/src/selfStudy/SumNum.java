package selfStudy;

public class SumNum {
	static int count=0;
	int i=0;
	public void changeCount() {
		while(i<5) {
			i++;
			count++;
		}
	}

	public static void main(String[] args) {
        SumNum check1=new SumNum();
        SumNum check2=new SumNum();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count+":"+check2.count);
	}

}
