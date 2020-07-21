package selfStudy1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

	public static void main(String[] args) {
	 List<Map<String, String>>employees=new ArrayList<Map<String,String>>();
	 Map<String, String>emp1Data=new HashMap<String, String>();
	 emp1Data.put("EmpID", "123");
	 emp1Data.put("EmpName", "Mike");
	 emp1Data.put("JobTitle", "SDET");
	 emp1Data.put("Salary", "50000");
	 emp1Data.put("country", "ABD");
	 emp1Data.put("city", "NYC");
	 Map<String, String>emp2Data=new HashMap<String, String>();
	 emp2Data.put("EmpID", "123");
	 emp2Data.put("EmpName", "Mike");
	 emp2Data.put("JobTitle", "SDET");
	 emp2Data.put("Salary", "50000");
	 emp2Data.put("country", "ABD");
	 emp2Data.put("city", "NYC");
	 employees.add(emp1Data);
	 employees.add(emp2Data);
	 System.out.println(employees.toString());
	 System.out.println(employees.size());
	 System.out.println(employees.get(0).get("EmpName"));
	 int totalSalary=0;
	 for (Map<String, String> map : employees) {
		totalSalary+=Integer.parseInt(map.get("Salary"));
	}
	System.out.println(totalSalary);
	}

}
