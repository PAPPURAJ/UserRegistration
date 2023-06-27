package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import database.User;
import database.UserDao;

@Controller
public class HomeController {
	
	private ApplicationContext context;
	private UserDao dao;
	
	public HomeController() {
		super();
		context=new ClassPathXmlApplicationContext("database/config.xml");
		dao=context.getBean("myd",UserDao.class);
		System.out.println("init");
	}

	@RequestMapping("/")
	public String home() {
		System.out.println("home");
		System.out.println(dao.insertUser(new User("pappuraj.duet@gmail.com","12345678")));
		return "page1";
	}
	
	@RequestMapping("verify")
	public String verificationPage() {	
		System.out.println("verify");
		System.out.println(dao.isUserValid("pappuraj.duet@gmail.com", "123456789"));
		return "page2";
	}
	
	@RequestMapping("otp")
	public String otp() {
		System.out.println("otp");
		return "page3";
	}
	
	@RequestMapping("profile")
	public String userProfile() {	
		System.out.println("profile");
		return "page4";
	}

	
	
}