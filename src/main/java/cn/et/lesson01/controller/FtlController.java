package cn.et.lesson01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FtlController {

	@RequestMapping("/ftlHello")
	public String helloFtl(Model model){
		model.addAttribute("hobbyArr",new String[]{"AA","BB","CC"});
		return "aa";
	}
}
