import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsoleApp {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		String inputColor = "";
		String brokerServiceURL = "http://localhost:8020/broker-service";
		String response = "";
		while (true) {
			System.out.print("Enter Your Color: ");
			inputColor = bufferRead.readLine();

			String colorServiceUrl = "";
			try {
				colorServiceUrl = triggerService(brokerServiceURL + "/" + inputColor);
				System.out.println("colorServiceUrl:" + colorServiceUrl);
				if (response.equalsIgnoreCase("No service found")) {
					System.out.println("Invalid Color");
					
				} else {
					response = triggerService(colorServiceUrl);
					System.out.println(response);
				}

			} catch (Exception exp) {
				System.out.println("Failed to hit the service: "+exp.getMessage());
				 new SystemException(exp);
			}
			System.out.println("####################");
		}
	}
	
	public static String triggerService(String URL) throws Exception {
		
		URL url = new URL(URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(
            (conn.getInputStream())));

        String output;
        //System.out.println("Output from Server .... \n");
		/*
		 * while ((output = br.readLine()) != null) { System.out.println(output); }
		 */
		return output=br.readLine();
	}

}
