package com.foodmap.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foodmap.common.util.UtilFunction;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/memberView")
	public String memberView(MemberVo vo, Model model) throws Exception{
//		System.out.println("dto.getSeq() : " + dto.getSeq());
//		System.out.println("dto.getName() : " + dto.getName());		
//		System.out.println("dto.getInsertDate() : " + dto.getInsertDate());		
//		model.addAttribute("item", service.selectOne(dto));

		return "/xdm/v1/infra/member/memberView";
	}
	
	@RequestMapping(value = "/memberForm")
	public String memberForm(MemberVo vo, Model model) throws Exception{
//
//		model.addAttribute("item", service.selectOne(dto));
		model.addAttribute("item", service.selectList(vo));

		return "/xdm/v1/infra/member/memberForm";
	}
	
	@RequestMapping(value = "/memberLogin")
	public String memberLogin(MemberVo vo) throws Exception{

		return "/xdm/v1/infra/member/codeGroupLogin";
	}
	
	@RequestMapping(value = "/memberRegForm")
	public String memberRegForm(MemberVo vo) throws Exception{
//		System.out.println(dto.getSeq());
//		System.out.println(dto.getName());

		return "/xdm/v1/infra/member/memberRegForm";
	}
	
	@RequestMapping(value = "/memberDelForm")
	public String codeGroupDelForm(MemberVo vo) throws Exception{
//		System.out.println(dto.getSeq());
//		System.out.println(dto.getName());

		return "xdm/v1/infra/ddm/form-layout4";
	}
	
//	@RequestMapping(value = "/memberInsert")
//	public String memberInsert(MemberVo vo) throws Exception{
//		service.insert(dto); // 서비스의 insert 호출
//
//		return "redirect:/memberXdmList"; // 이전 페이지로
//	}
//	
//	@RequestMapping(value = "/memberUpdt")
//	public String memberUpdt(MemberVo vo) throws Exception{
//		service.update(dto);
//		return "redirect:/memberXdmList";
//	}
//	
//	@RequestMapping(value = "/memberUpdtDel")
//	public String memberUpdtDel(MemberVo vo) throws Exception{
//		service.updateDelete(dto);
//		return "redirect:/memberXdmList";
//	}
//	
//	@RequestMapping(value = "/memberDelete")
//	public String memberDelete(MemberVo vo) throws Exception{
//		service.delete(dto);
//		return "redirect:/memberXdmList";
//	}
	
	@RequestMapping(value = "/memberXdmList")
	public String memberXdmList(@ModelAttribute("vo") MemberVo vo, Model model) throws Exception{
	
//		model.addAttribute("list", service.selectList(vo));

		
		UtilFunction.setSearch(vo);
		
		model.addAttribute("list", service.selectList(vo));

//		model.addAttribute("vo", vo);

		return "xdm/v1/infra/member/memberXdmList";
	}
	
}
