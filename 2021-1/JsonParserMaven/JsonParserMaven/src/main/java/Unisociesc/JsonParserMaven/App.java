package Unisociesc.JsonParserMaven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicNameValuePair;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String jsonString = "{"
				+ "  \"name\": \"coderolls\","
				+ "  \"type\": \"blog\","
				+ "  \"address\": {"
				+ "    \"street\": \"1600 Pennsylvania Avenue NW\","
				+ "    \"city\": \"Washington\","
				+ "    \"state\": \"DC\""
				+ "  },"
				+ "  \"employees\": ["
				+ "    {"
				+ "      \"firstName\": \"John\","
				+ "      \"lastName\": \"Doe\""
				+ "    },"
				+ "    {"
				+ "      \"firstName\": \"Anna\","
				+ "      \"lastName\": \"Smith\""
				+ "    },"
				+ "    {"
				+ "      \"firstName\": \"Peter\","
				+ "      \"lastName\": \"Jones\""
				+ "    }"
				+ "  ]"
				+ "}";
		System.out.println("Parsing the json string in java using Gson......\n");
		Gson gson = new Gson();
		JsonObject coderollsJsonObject = gson.fromJson(jsonString, JsonObject.class);
		String name = coderollsJsonObject.get("name").getAsString();
		System.out.println("Name: "+name+"\n");
		JsonObject addressJsonObject = coderollsJsonObject.get("address").getAsJsonObject();
		String street = addressJsonObject.get("street").getAsString();
		System.out.println("Street: "+street+"\n");
		JsonArray employeesJsonArray = coderollsJsonObject.get("employees").getAsJsonArray();
		System.out.println("Printing the employess json array: \n"+employeesJsonArray.toString()+"\n");
		JsonObject employeeJsonObject = employeesJsonArray.get(0).getAsJsonObject();
		String firstName = employeeJsonObject.get("firstName").getAsString();
		System.out.println("First Name of the employee at index 0: "+firstName);
		
		try {
			HttpRequest request = new HttpRequest();
			String jsonData = request.sendHttpGETRequest("https://jsonplaceholder.typicode.com/posts");
			wait();
			System.out.println("Data:"+jsonData);
			JsonObject parsedData = gson.fromJson(jsonData, JsonObject.class);
			System.out.println("Title:"+parsedData.get("title").getAsString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	/*
		 try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            final HttpGet httpGet = new HttpGet("https://pokeapi.co/api/v2/pokemon/ditto");
            
            try (final CloseableHttpResponse response1 = httpclient.execute(httpGet)) {
                System.out.println(response1.getCode() + " " + response1.getReasonPhrase());
                final HttpEntity entity1 = response1.getEntity();
                System.out.println(EntityUtils.toString(entity1));
                EntityUtils.consume(entity1);
                
            } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            final HttpPost httpPost = new HttpPost("http://httpbin.org/post");
            final List<NameValuePair> nvps = new ArrayList<>();
            nvps.add(new BasicNameValuePair("username", "vip"));
            nvps.add(new BasicNameValuePair("password", "secret"));
            httpPost.setEntity(new UrlEncodedFormEntity(nvps));

            try (final CloseableHttpResponse response2 = httpclient.execute(httpPost)) {
                System.out.println(response2.getCode() + " " + response2.getReasonPhrase());
                final HttpEntity entity2 = response2.getEntity();
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity2);
            }
            
            
        }
		 */
    }
}
