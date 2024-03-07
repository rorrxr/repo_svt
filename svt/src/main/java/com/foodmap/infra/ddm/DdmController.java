package com.foodmap.infra.ddm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DdmController {
	
//	@Autowired
//	CodeGroupService service;
//	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "index")
	public String index(Model model) throws Exception{

		return "xdm/v1/infra/ddm/index";
	}

	
	@RequestMapping(value = "login")
	public String login(Model model) throws Exception{

		return "xdm/v1/infra/ddm/login";
	}
	
//	@RequestMapping(value = "form")
//	public String form(Model model) throws Exception{
//
//		return "xdm/v1/infra/ddm/form-layout1";
//	}
//	
	
//	@RequestMapping(value = "codeGroupXdmList")
//	public String codeGroupXdmList(Model model) throws Exception{
//
//		return "xdm/v1/infra/ddm/tables";
//	}
	
//	
//	@RequestMapping(value = "/codeGroupDelete")
//	public String codeGroupDelete(CodeGroupDto dto) throws Exception{
//		service.delete(dto);
//		return "redirect:/codeGroupXdmList";
//	}
	
	
}
