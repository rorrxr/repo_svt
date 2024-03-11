package com.foodmap.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foodmap.infra.codeGroup.CodeGroupDto;

@Controller
public class CodeController {
	@Autowired
	CodeService service;
	
	@RequestMapping(value = "/codeXdmList")
	public String codeXdmList(Model model) throws Exception{
		model.addAttribute("list", service.selectList());
		
		return "xdm/v1/infra/ddm/tables2";
	}
	

	@RequestMapping(value = "/codeView")
	public String codeView(CodeDto dto, Model model) throws Exception{
//		System.out.println("dto.getSeq() : " + dto.getSeq());
//		System.out.println("dto.getName() : " + dto.getName());		
//		System.out.println("dto.getInsertDate() : " + dto.getInsertDate());		
		model.addAttribute("item", service.selectOne(dto));
		
		return "xdm/v1/infra/ddm/form-layout5";
	}
	
	@RequestMapping(value = "/codeForm")
	public String codeForm(CodeDto dto, Model model) throws Exception{
//
//		model.addAttribute("item", service.selectOne(dto));
		model.addAttribute("item", service.selectOne(dto));

		return "xdm/v1/infra/ddm/form-layout6";
	}
	
	@RequestMapping(value = "/codeLogin")
	public String codeLogin(CodeDto dto) throws Exception{

		return "/xdm/v1/infra/code/codeLogin";
	}
	
	@RequestMapping(value = "/codeRegForm")
	public String codeRegForm(CodeDto dto) throws Exception{
//		System.out.println(dto.getSeq());
//		System.out.println(dto.getName());

		return "/xdm/v1/infra/code/codeRegForm";
	}
	
	@RequestMapping(value = "/codeDelForm")
	public String codeDelForm(CodeDto dto) throws Exception{
//		System.out.println(dto.getSeq());
//		System.out.println(dto.getName());

		return "xdm/v1/infra/ddm/form-layout4";
	}
	
	@RequestMapping(value = "/codeInsert")
	public String codeInsert(CodeDto dto) throws Exception{
		service.insert(dto); // 서비스의 insert 호출

		return "redirect:/codeXdmList"; // 이전 페이지로
	}
	
	@RequestMapping(value = "/codeUpdt")
	public String codeUpdt(CodeDto dto) throws Exception{
		service.update(dto);
		return "redirect:/codeXdmList";
	}
	
	@RequestMapping(value = "/codeUpdtDel")
	public String codeUpdtDel(CodeDto dto) throws Exception{
		service.updateDelete(dto);
		return "redirect:/codeXdmList";
	}
	
	@RequestMapping(value = "/codeDelete")
	public String codeDelete(CodeDto dto) throws Exception{
		service.delete(dto);
		return "redirect:/codeXdmList";
	}
	
	
}
