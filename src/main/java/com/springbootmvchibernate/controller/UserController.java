package com.springbootmvchibernate.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.springbootmvchibernate.dao.UserDao;
import com.springbootmvchibernate.pojo.User;
@Controller
public class UserController {
	@Autowired
	private UserDao daoImpl;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/regform")
	public String showRegForm() {
		return "register";
	}
	@GetMapping("/about")
	public String showAbout() {
		return "about";
	}
	@GetMapping("/buy")
	public String showBuy() {
		return "buy";
	}
	
	@GetMapping("/contact")
	public String showContact() {
		return "contact";
	}
	
	@PostMapping("/checkuser")
	public String checkUser(User user , Model m , HttpServletRequest request) {
		
		HttpSession session = request.getSession(true);
		
		if(daoImpl.checkUserCredentials(user)) {
			
			session.setAttribute("USERNAME", user.getUsername());
			return "home";
		}
		else {
			m.addAttribute("MESSAGE", "loginerror");
			return "index";
		}
	}
	
	@PostMapping("/reguser")
	public String registerUser(User user, Model m) {
		
		if(daoImpl.addNewUser(user)) {
			m.addAttribute("MESSAGE", "regsuccess");
			return "index";
		}
		else {
			m.addAttribute("MESSAGE", "regerror");
			return "index";
		}
	}
}














