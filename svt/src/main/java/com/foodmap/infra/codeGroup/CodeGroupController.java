package com.foodmap.infra.codeGroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService service;
//	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/codeGroupXdmList")
	public String codeGroupXdmList(Model model) throws Exception{
//		List<CodeGroupDto> list = service.selectList();
//		List<CodeGroupDto> codeGroupDtos = service.selectList();
		
//		for(CodeGroupDto a:codeGroupDtos) {
//			System.out.println(a.getName());                                                     
//		}
		
		model.addAttribute("list", service.selectList());

		return "xdm/v1/infra/ddm/tables";
	}

//	@RequestMapping(value = "/codeGroupView")
//	public String codeGroupView(CodeGroupDto dto, Model model) throws Exception{
////		System.out.println("dto.getSeq() : " + dto.getSeq());
////		System.out.println("dto.getName() : " + dto.getName());		
////		System.out.println("dto.getInsertDate() : " + dto.getInsertDate());		
//		model.addAttribute("item", service.selectOne(dto));
//
//		return "/xdm/v1/infra/codeGroup/codeGroupView";
//	}
//	
//	@RequestMapping(value = "/codeGroupForm")
//	public String codeGroupForm(CodeGroupDto dto, Model model) throws Exception{
////
////		model.addAttribute("item", service.selectOne(dto));
//		model.addAttribute("item", service.selectOne(dto));
//
//		return "/xdm/v1/infra/codeGroup/codeGroupForm";
//	}
//	
//	@RequestMapping(value = "/codeGroupLogin")
//	public String codeGroupLogin(CodeGroupDto dto) throws Exception{
//
//		return " codeGroupLogin";
//	}
//	
//	@RequestMapping(value = "/codeGroupRegForm")
//	public String codeGroupRegForm(CodeGroupDto dto) throws Exception{
////		System.out.println(dto.getSeq());
////		System.out.println(dto.getName());
//
//		return "/xdm/v1/infra/codeGroup/codeGroupRegForm";
//	}
//	
//	@RequestMapping(value = "/codeGroupInsert")
//	public String codeGroupInsert(CodeGroupDto dto) throws Exception{
//		service.insert(dto); // 서비스의 insert 호출
//
//		return "redirect:/codeGroupXdmList"; // 이전 페이지로
//	}
//	
//	@RequestMapping(value = "/codeGroupUpdt")
//	public String codeGroupUpdt(CodeGroupDto dto) throws Exception{
//		service.update(dto);
//		return "redirect:/codeGroupXdmList";
//	}
//	
//	@RequestMapping(value = "/codeGroupUpdtDel")
//	public String codeGroupUpdtDel(CodeGroupDto dto) throws Exception{
//		service.updateDelete(dto);
//		return "redirect:/codeGroupXdmList";
//	}
//	
//	@RequestMapping(value = "/codeGroupDelete")
//	public String codeGroupDelete(CodeGroupDto dto) throws Exception{
//		service.delete(dto);
//		return "redirect:/codeGroupXdmList";
//	}
//	
//	
}
