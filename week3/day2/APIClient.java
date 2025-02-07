package week3.day2;

public class APIClient {

	public static final Boolean FALSE = false;
	public static final Boolean TRUE = true;

	public void sendRequest(String endpoint){
		System.out.println(endpoint+" ");
	}
	
    public void sendRequest(String endpoint, String requestBody, Boolean requestStatus){
    	System.out.println(endpoint+" "+requestBody+" "+requestStatus);
		
	}
    
    public static void main(String[] args) {
		APIClient client = new APIClient();
		client.sendRequest("Endpoint String");
		client.sendRequest("endpoint", "requestbody", TRUE);
		
	}
}
