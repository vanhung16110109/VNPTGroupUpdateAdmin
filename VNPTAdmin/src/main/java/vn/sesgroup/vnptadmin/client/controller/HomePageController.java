package vn.sesgroup.vnptadmin.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomePageController {

	@RequestMapping(value={"","/homepage"})
	public String HomePage() {
		return "client/TrangChu";
	}
}
