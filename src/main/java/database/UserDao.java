package database;

import java.util.List;


public interface UserDao {
	int insertUser(User product);
	boolean isUserValid(String username,String password);
}