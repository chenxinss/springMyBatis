package springMyBatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.User;
import com.service.UserServiceImpl;

public class UserTest {

	@Test
	public void test() {
		ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
		UserServiceImpl userservice=(UserServiceImpl) ac.getBean("userServiceImpl");
		User user=new User();
		user.setUserRole(3);
		user.setUserName("张华");
		
		List<User> userlist=userservice.getUserList(user);

		for(User u:userlist)
		{
			System.out.println("用户名"+u.getUserName());
			System.out.println("用户名"+u.getUserRoleName());
		}
			
	}

}
