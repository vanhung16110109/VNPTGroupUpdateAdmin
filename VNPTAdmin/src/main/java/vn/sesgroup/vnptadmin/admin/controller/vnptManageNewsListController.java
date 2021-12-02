package vn.sesgroup.vnptadmin.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class vnptManageNewsListController {

	@RequestMapping(value = "/admin/manage-news-list")
	public String ManageNewsList() {
		return "admin/QuanLyDanhSachTinTuc";
	}
}
