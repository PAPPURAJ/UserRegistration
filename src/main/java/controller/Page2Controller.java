package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import database.UserDao;
import util.*;

@Controller
public class Page2Controller {
	private ApplicationContext context;
	private UserDao dao;
	
	
	
	public Page2Controller() {
		super();
		context=new ClassPathXmlApplicationContext("database/config.xml");
		dao=context.getBean("myd",UserDao.class);
	}



	@RequestMapping("submitpage2")
	public String submitpage2(@RequestParam("email")String email,Model model) {	
		String otp=MyOTPgen.generateOTP();
		//model.addAttribute("email",email);
		model.addAttribute("otpV","232");
	//	MyMail.send(email,otp);
		System.out.println("submit page 2 working");
		return "page3";
	}

	
}
