package com.foodmap.infra.codeGroup;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

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

	@RequestMapping(value = "/codeGroupView")
	public String codeGroupView(CodeGroupDto dto, Model model) throws Exception{
//		System.out.println("dto.getSeq() : " + dto.getSeq());
//		System.out.println("dto.getName() : " + dto.getName());		
//		System.out.println("dto.getInsertDate() : " + dto.getInsertDate());		
//		model.addAttribute("item", service.selectOne(dto));

		return "xdm/v1/infra/ddm/form-layout1";
	}
	
	@RequestMapping(value = "/codeGroupForm")
	public String codeGroupForm(CodeGroupDto dto, Model model) throws Exception{
//
//		model.addAttribute("item", service.selectOne(dto));
		model.addAttribute("item", service.selectOne(dto));

		return "xdm/v1/infra/ddm/form-layout2";
	}
	
	@RequestMapping(value = "/codeGroupLogin")
	public String codeGroupLogin(CodeGroupDto dto) throws Exception{

		return " codeGroupLogin";
	}
	
	@RequestMapping(value = "/codeGroupRegForm")
	public String codeGroupRegForm(CodeGroupDto dto) throws Exception{
//		System.out.println(dto.getSeq());
//		System.out.println(dto.getName());

		return "/xdm/v1/infra/codeGroup/codeGroupRegForm";
	}
	
	@RequestMapping(value = "/codeGroupDelForm")
	public String codeGroupDelForm(CodeGroupDto dto) throws Exception{
//		System.out.println(dto.getSeq());
//		System.out.println(dto.getName());

		return "xdm/v1/infra/ddm/form-layout4";
	}
	
	@RequestMapping(value = "/codeGroupInsert")
	public String codeGroupInsert(CodeGroupDto dto) throws Exception{
		service.insert(dto); // 서비스의 insert 호출

		return "redirect:/codeGroupXdmList"; // 이전 페이지로
	}
	
	@RequestMapping(value = "/codeGroupUpdt")
	public String codeGroupUpdt(CodeGroupDto dto) throws Exception{
		service.update(dto);
		return "redirect:/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/codeGroupUpdtDel")
	public String codeGroupUpdtDel(CodeGroupDto dto) throws Exception{
		service.updateDelete(dto);
		return "redirect:/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/codeGroupDelete")
	public String codeGroupDelete(CodeGroupDto dto) throws Exception{
		service.delete(dto);
		return "redirect:/codeGroupXdmList";
	}
	
//	@RequestMapping(value = "/codeGroupDelete")
//	public String codeGroupDelete(CodeGroupDto dto, Map<String,Object> commandMap) throws Exception{
//		int result=1;
//        try {
//            int cnt = Integer.parseInt((String) commandMap.get("CNT"));
//            String rprtOdr = (String)commandMap.get("RPRT_ODR");
//            String [] strArray = rprtOdr.split(",");
//            for(int i=0; i<cnt; i++) {
//                int temp = Integer.parseInt((String)strArray[i]);
//                commandMap.put("RPRT_ODR", temp);
//               service.delete(dto, "ReportDAO.deleteReport", commandMap);
//            }
//        } catch (Exception e) {
////            log.debug(e.getMessage());
//            result=0;
//        }
//        return "redirect:/codeGroupXdmList";
//	}
	
//	@RequestMapping(value = "/delete")
//	public String ajaxTest(HttpServletRequest request) {
//		
//		String[] ajaxMsg = request.getParameterValues("valueArr");
//		int size = ajaxMsg.length;
//		for(int i = 0; i < size; i++) {
//			service.delete(ajaxMsg[i]);
//		}
//		
//		return "redirect:/codeGroupXdmList";
//	}
//	

}
