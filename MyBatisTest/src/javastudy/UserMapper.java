package javastudy;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import utility.SqlProvider;

public interface UserMapper {
	//@Select("select * from User where id = #{id}")
	@SelectProvider(type=SqlProvider.class, method="selectUser")
	public User selectUser(int id);
	
	//@Select("select * from User")
	@SelectProvider(type=SqlProvider.class, method="selectAll")
	public List<User> selectAll();
	
	//@Insert("insert into User (userName,userPwd) values (#{userName},#{userPwd})")
	@InsertProvider(type=SqlProvider.class, method="addUser")
	public void addUser(User user);
	
	//@Update("update User set userName=#{userName}, userPwd=#{userPwd} where id=#{id}")
	@UpdateProvider(type=SqlProvider.class, method="updateUser")
	public void updateUser(User user);
	
	//@Delete("delete from User where id=#{id}")
	@DeleteProvider(type=SqlProvider.class, method="deleteUser")
	public void deleteUser(int id);
}
