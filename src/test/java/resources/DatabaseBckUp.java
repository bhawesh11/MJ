package resources;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseBckUp {

	public String getJSON(String brandName, String scriptName) {
		Connection con;
		String jsonString = null;
		String sql = "SELECT testdata FROM data d, script s, application a, brand b\n" +
				"WHERE d.AppId = a.AppId\n" +
				"AND d.ScriptId = s.ScriptId\n" +
				"AND d.BrandId = b.BrandId\n" +
				"AND b.BrandName = ? " +
				"AND a.AppName='Quotes'\n" +
				"AND s.ScriptName= ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/qat", "root","Passw0rd");
			java.sql.PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, brandName);
			stmt.setString(2, scriptName);
			System.out.println("------------"+stmt);
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
			jsonString = rs.getString(1);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return jsonString;
	}

	// -----------------------------------------------------------------------------------------------

	public static void saveOutputInDataBase(String script, String brand,
			String result, String input, String output) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://10.1.25.19:3306/qat?allowPublicKeyRetrieval=true&useSSL=false", "root",
					"P@ssw0rd");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO test(SCRIPT_ID,APP_ID,BRAND_ID,RESULT,INPUT,OUTPUT,TRIGGERER,TIMESTAMP)"
					+ "VALUES("
					+ "(SELECT SCRIPT_ID FROM script WHERE SCRIPT_NAME='"
					+ script.trim()
					+ "'),"
					+ "(SELECT APP_ID FROM application WHERE APP_NAME='Policy Center'),"
					+ "(SELECT BRAND_ID FROM brand WHERE BRAND_NAME='"
					+ brand
					+ "'),"
					+ "'"
					+ result
					+ "',"
					+ "'"
					+ input
					+ "',"
					+ "'"
					+ output + "'," + "'Admin'," + "CURRENT_TIMESTAMP)");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------
	// EXPERIMENTING
	public void insertRecordInDatabase(String script, String brand) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://10.1.25.19:3306/qat?allowPublicKeyRetrieval=true&useSSL=false", "root",
					"P@ssw0rd");
			Statement stmt = con.createStatement();
			int rowsInserted = stmt
					.executeUpdate("INSERT INTO test "
							+ "SET "
							+ "scriptId = (SELECT scriptId FROM script WHERE scriptName='"
							+ script.trim()
							+ "'), "
							+ "appId = (SELECT appId FROM application WHERE appName='Policy Center'), "
							+ "brandId = (SELECT brandId FROM brand WHERE brandName='"
							+ brand + "'), " + "TRIGGERER = 'Admin', "
							+ "timeStmap = CURRENT_TIMESTAMP");

			if (rowsInserted > 0) {
				// GET Record id
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

	// -----------------------------------------------------------------------------------------------
	// EXPERIMENTING
	public String get(String brandName, String scriptName) {
		Connection con;
		String jsonString = null;
		String sql = "SELECT testdata FROM data d, script s, application a, brand b\n" +
				"WHERE d.AppId = a.AppId\n" +
				"AND d.ScriptId = s.ScriptId\n" +
				"AND d.BrandId = b.BrandId\n" +
				"AND b.BrandName = ? " +
				"AND a.AppName='Quotes'\n" +
				"AND s.ScriptName= ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/qat", "root","Passw0rd");
			java.sql.PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, brandName);
			stmt.setString(2, scriptName);
			System.out.println("------------"+stmt);
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
				jsonString = rs.getString(1);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return jsonString;
	}
}