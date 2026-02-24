package homeassignments.week3.day4;

public class ApiClient {
	
	public void sendRequest (String endpoint) {
		
		System.out.println("input for endpoint: "  + endpoint);
	}

	public void sendRequest (String endpoint, String requestBody, Boolean requestStatus) {
		
		System.out.println("input for endpoint: "  + endpoint);
		System.out.println("Request Body: "  + requestBody);
		System.out.println("Request Status: " + requestStatus);
	        
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApiClient obj = new ApiClient();
		
		obj.sendRequest("https://leaftap.com/api/users");
		obj.sendRequest("https://leaftap.com/api/users", "\"name\"Lakshmi", true);

		
		
	}

}
