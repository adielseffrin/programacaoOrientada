package Unisociesc.JsonParserMaven;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest {
	private String USER_AGENT;

    private String GET_URL;

    private boolean HEADER;
    
    public HttpRequest() {
    	this.USER_AGENT = "Mozilla/5.0";
    	this.GET_URL = "https://www.google.com/search?q=javaguides";
    	this.HEADER = false;
    }
    
    /*public static void main(String[] args) throws IOException {
        sendHttpGETRequest();
    }*/

    public synchronized String sendHttpGETRequest(String url) throws IOException, InterruptedException {
        String responseString = null;
    	if(url == null || url.equals("")) url = this.GET_URL;
    	URL obj = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", this.USER_AGENT);
        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();

            // print result
            responseString = response.toString();
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }
        if(HEADER) {
	        for (int i = 1; i <= 8; i++) {
	            System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
	        }
        }
        
        return responseString;
        

    }
    
    public synchronized void sendHttpPOSTRequest(String url) throws IOException {
        if(url == null || url.equals("")) url = this.GET_URL;
    	URL obj = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", this.USER_AGENT);
        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_CREATED) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("POST request not worked");
        }
        if(HEADER) {
	        for (int i = 1; i <= 8; i++) {
	            System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
	        }
        }

    }
}
