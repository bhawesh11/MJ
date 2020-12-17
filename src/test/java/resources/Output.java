package resources;

import org.json.JSONException;
import org.json.JSONObject;

public class Output {

	private JSONObject output;

	// CONSTRUCTOR:
	Output(Database db, String brandName, String environment) {
		try {
			String json = db.getPolicyDetails(brandName,environment);
			if(json==null){
				json="{\"Policy No\":\"247-000-000-02\"}";
			}
			output = new JSONObject(json);
			output.put("Password", "Passw0rd");
			output.put("ZIP", "75001");
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	// ----------------------------------------------------------

	// GETTER / SETTER FOR OUTPUT:
	public void setOutput(String key, String value) {
		try {
			output.put(key, value);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	// ----------------------------------------------------------
	public String getOutput(String key) {
		String value = null;
		try {
			// GET VALUE ACCORDING TO KEY
			value = output.getString(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	// ----------------------------------------------------------
		String getOutputs() {
			return output.toString();
		}
}// close Class
