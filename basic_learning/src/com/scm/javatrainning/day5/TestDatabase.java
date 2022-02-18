package com.scm.javatrainning.day5;

import java.sql.*;

/**
 * <h2> TestDatabase Class</h2>
 * <p>
 * Process for Displaying TestDatabase
 * </p>
 * 
 * @author Acer
 *
 */
public class TestDatabase {

	/**
	 * <h2> connection</h2>
	 * <p>
	 * connection with database.
	 * </p>
	 */
	protected Connection connection;
	
	
	/**
	 * <h2> statement</h2>
	 * <p>
	 * statement of sql.
	 * </p>
	 */
	protected Statement statement;
	
	/**
	 * <h2> resultset</h2>
	 * <p>
	 * result set for sql statement.
	 * </p>
	 */
	protected ResultSet resultset;
	/**
	 * <h2> createConnection</h2>
	 * <p>
	 * Create connection to database.
	 * </p>
	 *
	 * @return void
	 */
	private void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:9906/test","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Database class not found!\nReason : " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot connect to database!\nReason : " + e.getMessage());
		}
	}
	
	/**
	 * <h2> getData</h2>
	 * <p>
	 * Get data from specify table name.
	 * </p>
	 *
	 * @param tablename - String
	 * @return
	 * @return String
	 */
	public String getData(String tablename) {
		String result = "";
		this.connect();
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery("SELECT * FROM " + tablename);
			while(resultset.next()) {
				result += "Username : " + resultset.getString(1) + 
						"\nPassword : " + resultset.getString(2);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connot execute sql statement.\nReason : " + e.getMessage());
		}
		result = result.trim().length() != 0 ? result : "No data found.";
		return result;
	}

	/**
	 * <h2> setData</h2>
	 * <p>
	 * Insert into database with specify table name.
	 * </p>
	 *
	 * @param tbname - String
	 * @param data - String array
	 * @return void
	 */
	public void setData(String tbname,String[] data) {
		this.connect();
		String tbdata = this.specifyTableData(data);
		String sql = "INSERT INTO `"+ tbname +"` VALUES "+tbdata+" ";
		
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot insert data!\nReason : " + e.getMessage());
		}
		
	}
	
	/**
	 * <h2> specifyTableData</h2>
	 * <p>
	 * 	Check and return data to be inserted to database.
	 * </p>
	 *
	 * @param data - String array
	 * @return
	 * @return String
	 */
	private String specifyTableData(String[] data) {
		String res = "";
		for(int i = 0;i <data.length;i++) {
			res += "'"+data[i]+"', ";
		}
		res = "(" + res.substring(0,res.lastIndexOf(",")) + ")";
		return res;
	}
	
	/**
	 * <h2> main</h2>
	 * <p>
	 * Main method to run program.
	 * </p>
	 *
	 * @param args - String array
	 * @return void
	 */
	public static void main(String[] args) {
		TestDatabase test = new TestDatabase();
		String[] data = {"Mg Mg","mgmg123"};
		test.setData("test", data);
		System.out.println(test.getData("test"));
		
	}
}
