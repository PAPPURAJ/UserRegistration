package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import util.MyMail;
import util.MyOTPgen;

@Controller
public class Page3Controller {
	@RequestMapping("otp")
	public String otp() {
		System.out.println("otp");
		return "page3";
	}

	
	@RequestMapping("otpsubmit")
	public String submitpage3(@RequestParam("otp")String otp,@RequestParam("genOtp")String genOtp,Model model) {	
		System.out.println("Verification: "+(otp==genOtp));

		return "page4";
	}
		
}
