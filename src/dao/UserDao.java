package dao;

import java.util.HashMap;
import java.util.Map;

import bean.UserBean;

public class UserDao {
	
	private static UserDao userDao;
	
	private Map<String, UserBean> usersDb = new HashMap<String, UserBean>();
	
	{
		UserBean admin = new UserBean();
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setSex("male");
		admin.setAddress("SH");
		admin.setEmail("admin@admin.com");
		admin.setTel("021-021");
		usersDb.put(admin.getUsername(), admin);
	}
	
	private UserDao() {
		
	}
	
	public static UserDao getInstance(){
		if (userDao == null) {
			userDao = new UserDao();
		}
		
		return userDao;
	}
	
	public void createUser(UserBean user) {
		usersDb.put(user.getUsername(), user);
	}
	
	public void updateUser(UserBean user) {
		usersDb.put(user.getUsername(), user);
	}
	
    public UserBean queryUser(UserBean user) {
		return usersDb.get(user.getUsername());
	}
	
    public void delUser(UserBean user) {
		usersDb.remove(user.getUsername());
	}
    
    public Map<String, UserBean> getAll(){
    	return usersDb;
    }
}
