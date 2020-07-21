package selfStudy;

import java.util.Arrays;

public class Password {

	public static void main(String[] args) {
		String info="This info is used for password:****ergun****.Please don not share this";
		String info2="This info is used for password:****kaldirim****.Please don not share this";
		
		String[] infoArray=info.split("password:");
		String[] infoArray2=info2.split("password:");
		String infoArrayLast=infoArray[1].split(".Please")[0];
		String infoArrayLast2=infoArray2[1].split(".Please")[0];
		System.out.println(infoArrayLast.substring(4,9).trim()+infoArrayLast2.substring(4,12).trim());
		
        
	}

}
