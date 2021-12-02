package vn.sesgroup.vnptadmin.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class vnptNewsDetailsController {

	@RequestMapping(value="/admin/news-detail")
	public String newsDetail() {
		return "admin/ChiTietTinTuc";
	}
	
}
