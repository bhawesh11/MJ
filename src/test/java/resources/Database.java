package resources;
import java.sql.*;

public class Database {
	static Connection con=null;

	private static Connection getConnection() {
		if (con == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/qat", "root", "Passw0rd");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}

	private static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------------------------------------------------------------------------
	//GETS JSON FOR TEST DATA:
	public String getJSON(String brandName, String scriptName) {

		String jsonString = null;
		String sql = "SELECT testdata FROM data d, script s, application a, brand b\n" +
				"WHERE d.AppId = a.AppId\n" +
				"AND d.ScriptId = s.ScriptId\n" +
				"AND d.BrandId = b.BrandId\n" +
				"AND b.BrandName = ?\n" +
				"AND a.AppName='Quotes'\n" +
				"AND s.ScriptName= ?";
		try {

			java.sql.PreparedStatement stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, brandName);
			stmt.setString(2, scriptName);
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
			jsonString = rs.getString(1);
		} catch (Exception e) {
			System.out.println(e);
		}
		return jsonString;
	}

	// -----------------------------------------------------------------------------------------------
	//GETS JSON FOR TEST DATA:
	public String getPolicyDetails(String brandName,String environment) {

		String policyDetails = null;
		String sql = "SELECT Output FROM test\n" +
				"WHERE TestId = (\n" +
				"SELECT MAX(TestId) FROM application a, test t, brand b, data d, environment e\n" +
				"WHERE t.BrandId = b.BrandId\n" +
				"AND a.AppId =d.AppId\n" +
				"AND e.EnvId = t.EnvId\n" +
				"AND t.dataId = d.dataId\n" +
				"AND b.BrandName = ?\n" +
				"AND (a.AppName = 'Policy Center' OR a.appName = 'Quotes')\n" +
				"AND e.EnvName = ?\n" +
				"AND NOT t.UseStatus = 'Expired');";
		try {
			java.sql.PreparedStatement stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, brandName);
			stmt.setString(2, environment);
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
				policyDetails = rs.getString(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return policyDetails;
	}

	// -----------------------------------------------------------------------------------------------

	public static void saveOutputInDataBase(String script, String brand,
			String result, String input, String output) {
		try {
			Statement stmt = getConnection().createStatement();
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----------------------------------------------------------------------------------------------
	// EXPERIMENTING
	public void insertRecordInDatabase(String script, String brand) {
		try {
			Statement stmt = getConnection().createStatement();
			int rowsInserted = stmt
					.executeUpdate("INSERT INTO test "
							+ "SET "
							+ "scriptId = (SELECT scriptId FROM script WHERE scriptName='"
							+ script.trim()
							+ "'), "
							+ "appId = (SELECT appId FROM application WHERE appName='Policy Center'), "
							+ "brandId = (SELECT brandId FROM brand WHERE brandName='"
							+ brand + "'), " + "TRIGGERER = 'Admin', "
							+ "timeStamp = CURRENT_TIMESTAMP");

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
		String jsonString = null;
		String sql = "SELECT testdata FROM data d, script s, application a, brand b\n" +
				"WHERE d.AppId = a.AppId\n" +
				"AND d.ScriptId = s.ScriptId\n" +
				"AND d.BrandId = b.BrandId\n" +
				"AND b.BrandName = ? " +
				"AND a.AppName='Quotes'\n" +
				"AND s.ScriptName= ?";
		try {
			java.sql.PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, brandName);
			stmt.setString(2, scriptName);
			System.out.println("------------"+stmt);
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
				jsonString = rs.getString(1);
		} catch (Exception e) {
			System.out.println(e);
		}
		return jsonString;
	}
}