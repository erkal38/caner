package selfStudy;

public class Channel {

	public static void main(String[] args) {
		String[][][]chs=new String[2][][];
	       chs[0]=new String[2][2];
	       chs[1]=new String[5][2];
	       chs[2]=new String[4][2];
	       int i=97;
	       for (int a=0;a<chs.length;a++) {
	    	   for(int b=0;b<chs.length;b++) {
	    		   for(int c=0;c<chs.length;c++)
	    		   chs[a][b][c]=""+i;
	    		   i++;
	    	   }
	       }
	       System.out.println(chs);
		}
}
