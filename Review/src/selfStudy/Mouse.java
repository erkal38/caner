package selfStudy;

public class Mouse extends Roden {
	
	protected int tailLength=8;
	public void getMouseDetails() {
		System.out.println("tail:"+tailLength+",parentTail:"+super.tailLength);
	}

}
