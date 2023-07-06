package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.protobuf.Method;

import database.User;
import database.UserDao;

@Controller
public class Page1Controller {
	
	private ApplicationContext context;
	private UserDao dao;
	
	public Page1Controller() {
		super();
		context=new ClassPathXmlApplicationContext("database/config.xml");
		dao=context.getBean("myd",UserDao.class);
		System.out.println("init");
	}
	
	
	

	@RequestMapping("/")
	public String home() {
		System.out.println("home");
		//System.out.println(dao.insertUser(new User("pappuraj.duet@gmail.com","12345678")));
		return "page1";
	}
	
	@RequestMapping(path="page1BtnClick",method=RequestMethod.POST)
	public String p1to2() {
		System.out.println("hi");
		return "page2";
	}

	

	
	@RequestMapping("profile")
	public String userProfile() {	
		System.out.println("profile");
		return "page4";
	}

	
	
}