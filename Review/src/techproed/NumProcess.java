package techproed;

public class NumProcess {

	public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=20;i++) {
	  if(i%2==0) {
		  System.out.print(i+",");
		  sum+=i;
		  System.out.print("sumEven="+sum);
	  }
	  System.out.println();
	}
	System.out.println();
    for(int j=1;j<=20;j++) {
    	if(j%2!=0) {
    		System.out.print(j+",");
    	}
    }
    System.out.println();
	for(int k=1;k<=20;k++) {
		if(k!=11&&k!=15) {
			System.out.print(k+",");
			
		}
	}
	System.out.println();
	for(int l=20;l>0;l--) {
		if(l%5==0) {
			System.out.print(l+",");
		}
	}
	}
}