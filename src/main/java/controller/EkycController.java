package controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import database.UserDao;

@Controller
public class EkycController{
	
	
	private ApplicationContext context;
	private UserDao dao;
	
	public EkycController() {
		super();
		context=new ClassPathXmlApplicationContext("database/config.xml");
		dao=context.getBean("myd",UserDao.class);
	}


	@RequestMapping("ekyc")
	public String ekyc() {
		System.out.println("ekyc");
		return "page5";
	}
	
	
	@RequestMapping(path="/myController",method=RequestMethod.POST)
	public String processForm(@RequestParam("userid")String userId,@RequestParam("password")String password,Model model) {
		model.addAttribute("login",dao.isUserValid(userId, password));
		return "successOrFailurePage";
	}

}
