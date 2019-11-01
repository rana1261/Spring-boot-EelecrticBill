package com.demo.ElectricBill.ElectricBillController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homepage() {
		
		return "Home";
	}
	
	@RequestMapping("/home")
	public String homepage1() {
		
		return "Home";
	}
	
	@RequestMapping("/RegistrationForm")
	public String RegistrationFormPage() {
		return "RegistrationForm";
	}

	
	@RequestMapping("/BillPay")
	public String BillPayPage() {
		return "BillPay";
	}
	
	@RequestMapping("/billReceipt_login")
	public String billReceipt_loginPage() {
		return "billReceipt_login";
	}
	
	@RequestMapping("/Admin_login")
	public String Admin_loginPage() {
		return "Admin_login";
	}
	
	@RequestMapping("/about")
	public String aboutPage() {
		return "about";
	}
	
	@RequestMapping("/billReceipt")
	public String billReceiptPage() {
		return "billReceipt";
	}
	
	@RequestMapping("/billWaitPage")
	public String billWaitPagePage() {
		return "billWaitPage";
	}
	
	@RequestMapping("/AdminData")
	public String AdminDataPage() {
		return "AdminData";
	}
	
	@RequestMapping("/deleteSuccessful")
	public String deleteSuccessfulPage() {
		return "deleteSuccessful";
	}
	
	@RequestMapping("/deleteFail")
	public String deleteFailPage() {
		return "deleteFail";
	}
	
	@RequestMapping("/saveSuccessfull")
	public String saveSuccessfullPage() {
		return "saveSuccessfull";
	}
	
	@RequestMapping("/saveFailed")
	public String saveFailedPage() {
		return "saveFailed";
	}
}
