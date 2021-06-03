import java.net.HttpURLConnection;
import java.net.URL;

public class RestapiTest{
	public static void main(String args[]) {
		try {
		URL url  = new URL("https://api.data.gov.in/resource/3b01bcb8-0b14-4abf-b6f2-c1bfd384ba69?api-key=579b464db66ec23bdd000001cdd3946e44ce4aad7209ff7b23ac571b&format=xml&offset=0&limit=10");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		
		int responsecode = conn.getResponseCode();
		if(responsecode !=200) throw new RuntimeException("Http Response code : "+responsecode);
		else {
			
		}
		
		
		
	}catch (Exception e) {
		System.out.println("Invalid API");
	}
	}
}

























/*import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
public class RestapiTest {
	public static void main(String args[]) {
		//Create Client
		Client client = ClientBuilder.newClient();
		//Target of Client
		WebTarget target = client.target("https://api.data.gov.in/resource/3b01bcb8-0b14-4abf-b6f2-c1bfd384ba69?api-key=579b464db66ec23bdd000001cdd3946e44ce4aad7209ff7b23ac571b&format=xml&offset=0&limit=10");
		System.out.println(target.request(MediaType.TEXT_XML).get(String.class)	
		);
		
		int i=0;
		//Response
		
		
	}
}*/
