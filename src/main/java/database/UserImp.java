package database;
import org.springframework.jdbc.core.JdbcTemplate;


public class UserImp implements UserDao{
	
	JdbcTemplate myJDBCtemp;
	private String tableName="user";
	
	
	
	public UserImp() {
		super();
	}
	
	

	public UserImp(JdbcTemplate myJDBCtemp) {
		super();
		this.myJDBCtemp = myJDBCtemp;
	}
	
	

	public JdbcTemplate getMyJDBCtemp() {
		return myJDBCtemp;
	}



	public void setMyJDBCtemp(JdbcTemplate myJDBCtemp) {
		this.myJDBCtemp = myJDBCtemp;
	}



	@Override
	public int insertUser(User user) {
		 return myJDBCtemp.update("INSERT INTO "+tableName+"(username,password) VALUES(?,?)", user.getUserID(),user.getPassword());
	}



	@Override
	public boolean isUserValid(String username, String password) {
		 try {
			 return myJDBCtemp.queryForObject("SELECT * FROM "+tableName+" WHERE userName=?", new MyRowMapper(),username).getPassword().equals(password);
			 
		} catch (Exception e) {
			return false;
		}
		
	}



	

}