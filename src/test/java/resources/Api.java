package resources;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Api {

	
	public String compareTest(Testing test)
	{
		String xmlString ;
		xmlString = test.getDb().getJSON(test.getBrandName(),test.getScriptName());
		System.out.println(xmlString);		
		
		String url = "https://partners.dev-elephant.com/api/aggregator/quotes";
			
		Response response = RestAssured.given().header("PartnerId", "QxQ12nyxbeJVAgnP7nY4xv47").header("admiral-txdomain","direct").header("admiral-txbrand","elephant").contentType("text/xml").body(xmlString).when().post(url).then().using().extract().response();
		
		String body = response.getBody().asString();
		System.out.println(body);
		
		int statusCode= response.statusCode();
		System.out.println(statusCode);
		
		String urltobuy = response.jsonPath().get("ClickToBuyUri");
		//System.out.println(urltobuy);
		return urltobuy;
		
		
	}
}
