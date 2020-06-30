package basics.selenium06112020;

public class DBRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//connect to DB or establish connection with the DB
		JDBCUtility.setupDBConnection();
		
		//run query
		JDBCUtility.runQuery("select * from public.actor");
		//get the result
		JDBCUtility.returnResult();
		//close the connection
		JDBCUtility.closeDBConnection();

	}

}
