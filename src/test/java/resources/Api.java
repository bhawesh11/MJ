package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Api {
	private Properties prop;
	private FileInputStream fis;
	private String path;
	private String value;

	/*public String compareTest(Testing test, String brandName) {
		String xmlString;
		//xmlString = getValue("xml", brandName);
		// xmlString = test.getDb().getJSON(test.getBrandName(),test.getScriptName());
		System.out.println(xmlString);
		xmlString = xmlString.replace("$last$", "Casino");
		xmlString = xmlString.replace("$zip$", "75001");
		xmlString = xmlString.replace("$effectivedate$", "2021-06-26");
		xmlString = xmlString.replace("$guid$", "d7e815a4-94ae-43dc-a241-2c1c3380f795");
		System.out.println();
		System.out.println(xmlString);

		// String url = "https://partners.dev-elephant.com/api/aggregator/quotes";
	//	String url = getValue("Endpoint", brandName);
		// System.out.println(url);
		Response response = RestAssured.given().header("PartnerId", "QxQ12nyxbeJVAgnP7nY4xv47")
				.header("admiral-txdomain", "direct").header("admiral-txbrand", "elephant").contentType("text/xml")
				.body(xmlString).when().post(url).then().using().extract().response();

		String body = response.getBody().asString();
		System.out.println(body);

		int statusCode = response.statusCode();
		System.out.println(statusCode);

		String urltobuy = response.jsonPath().get("ClickToBuyUri");
		// System.out.println(urltobuy);
		return urltobuy;

	}*/
	//V1_D1_001_Compare
	public String apiTest(Testing test, String brandName, String ScriptName) {
		
		loadPropertyFile(brandName,ScriptName);
		
		test.getLogger().info("Lead Property File Loaded!!!");
		
		String endURL = getPropertyValue("Endpoint");
		String xmlString = getPropertyValue("xml");
				
		xmlString = replaceSubString(xmlString,"$last$", test.getRandomString(6));
		xmlString = replaceSubString(xmlString,"$effectivedate$", test.webFunctions().getDate(1));
		xmlString = replaceSubString(xmlString,"$guid$", test.webFunctions().generateGUID(test));
		
			Response response = RestAssured.given().header("PartnerId", getPropertyValue("PartnerId"))
				.header("admiral-txdomain", getPropertyValue("admiral-txdomain")).header("admiral-txbrand", getPropertyValue("admiral-txbrand")).contentType("text/xml")
				.body(xmlString).when().post(endURL).then().using().extract().response();
		
		String body = response.getBody().asString();
		test.getLogger().info("Response : "+body);
		int statusCode = response.statusCode();
		test.getLogger().info("Response's Status Code : "+statusCode);
				
		String buyURI = response.jsonPath().get("ClickToBuyUri");
		
		test.getLogger().info("Landing URL : " + buyURI);
				
		return buyURI;
		
		
	}

	public void loadPropertyFile(String brandName, String ScriptName) {
		
		String num_TC = ScriptName.substring(6,9);
		String leadName = ScriptName.substring(10);
		try {
			prop = new Properties();
			path = System.getProperty("user.dir") + "//Info//" + brandName + "//Leads//"+ leadName +"//"+ num_TC +".properties";
			System.out.println(path);
			fis = new FileInputStream(path);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getPropertyValue(String key) {
		value = prop.getProperty(key);
		return value;
	}
	
	public String replaceSubString(String xmlString, String subString, String NewString) {
		String newReplacesStr = xmlString.replace(subString, NewString);
		return newReplacesStr;
	}
}
