package Practice.Practice;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		JSONObject employee = new JSONObject();
//		
//		employee.put("ID","1");
//		employee.put("ID","2");
//		
//		JSONObject employeobj = new JSONObject();
//		employeobj.put("employee",employee);
//		
//		JSONArray employList = new JSONArray();
//		
//	FileWriter json = new FileWriter("./data/file.json");
//	
//		json.write(employee.to)
//		
		
		JSONObject obj = new JSONObject();
		obj.put("Name", "crunchify.com");
		obj.put("Author", "App Shah");
 
		JSONArray company = new JSONArray();
		company.put("Compnay: eBay");
		company.put("Compnay: Paypal");
		company.put("Compnay: Google");
		obj.put("Company List", company);
		
		JSONObject ob = new JSONObject();
 
		// try-with-resources statement based on post comment below :)
		try (FileWriter file = new FileWriter("./data/file1.json")) {
			file.write(obj.toString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		
		

	}


}
}