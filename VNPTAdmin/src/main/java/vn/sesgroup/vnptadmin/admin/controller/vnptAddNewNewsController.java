package vn.sesgroup.vnptadmin.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class vnptAddNewNewsController {

	@RequestMapping(value = "/admin/add-new-news")
	public String AddNewNews() {
		return "admin/ThemMoiTinTuc";
	}
}
