package utility;

public class SqlProvider {

	public String selectUser(){
		return "select * from User where id = #{id}";
	}
	
	public String selectAll(){
		return "select * from User";
	}
	
	public String addUser(){
		return "insert into User (userName,userPwd) values (#{userName},#{userPwd})";
	}
	
	public String updateUser(){
		return "update User set userName=#{userName}, userPwd=#{userPwd} where id=#{id}";
	}

	public String deleteUser(){
		return "delete from User where id=#{id}";
	}
}
