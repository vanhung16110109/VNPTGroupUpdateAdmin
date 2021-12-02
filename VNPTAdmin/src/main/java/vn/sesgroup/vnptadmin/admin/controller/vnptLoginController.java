package vn.sesgroup.vnptadmin.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class vnptLoginController {

	@RequestMapping( value = "/admin/login")
	public String LoginForm() {
		return "admin/DangNhap";
	}
	
	
}
