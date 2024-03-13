package com.foodmap.infra.codeGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foodmap.constants.Constants;
import com.foodmap.util.UtilDateTime;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService service;
//	CodeGroupService codeGroupService;
	
//	@RequestMapping(value = "/codeGroupXdmList")
//	public String codeGroupXdmList(Model model) throws Exception{
////		List<CodeGroupDto> list = service.selectList();
////		List<CodeGroupDto> codeGroupDtos = service.selectList();
//		
////		for(CodeGroupDto a:codeGroupDtos) {
////			System.out.println(a.getName());                                                     
////		}
//		
//		model.addAttribute("list", service.selectList());
//
//		return "xdm/v1/infra/ddm/tables";
//	}
	public void setSearch(CodeGroupVo vo) throws Exception {
		/* 최초 화면 로딩시에 세팅은 문제가 없지만 */
		/*이후 전체적으로 데이터를 조회를 하려면 null 값이 넘어 오는 관계로 문제가 전체 데이터 조회가 되지 못한다.*/
		/*해서 BaseVo.java 에서 기본값을 주어서 처리*/
//		vo.setShUseNy(vo.getShUseNy() == null ? 1 : vo.getShUseNy());
//		vo.setShDelNy(vo.getShDelNy() == null ? 0 : vo.getShDelNy());
//		vo.setShOptionDate(vo.getShOptionDate() == null ? 2 : vo.getShOptionDate());
		
		/* 초기값 세팅이 있는 경우 사용 */
		vo.setShDateStart(vo.getShDateStart() == null
		    ? UtilDateTime.calculateDayReplace00TimeString(UtilDateTime.nowLocalDateTime(), Constants.DATE_INTERVAL)
		    : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null
		    ? UtilDateTime.nowString()
		    : UtilDateTime.addNowTimeString(vo.getShDateEnd()));		
		
//		/* 초기값 세팅이 없는 경우 사용 */
//		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
//		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		
		
	}
	@RequestMapping(value = "/codeGroupView")
	public String codeGroupView(CodeGroupDto dto, Model model) throws Exception{
//		System.out.println("dto.getSeq() : " + dto.getSeq());
//		System.out.println("dto.getName() : " + dto.getName());		
//		System.out.println("dto.getInsertDate() : " + dto.getInsertDate());		
//		model.addAttribute("item", service.selectOne(dto));

		return "/xdm/v1/infra/codeGroup/codeGroupView";
	}
	
	@RequestMapping(value = "/codeGroupForm")
	public String codeGroupForm(CodeGroupDto dto, Model model) throws Exception{
//
//		model.addAttribute("item", service.selectOne(dto));
		model.addAttribute("item", service.selectOne(dto));

		return "/xdm/v1/infra/codeGroup/codeGroupForm";
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
	
	@RequestMapping(value = "/codeGroupXdmList")
	public String codeGroupXdmList(@ModelAttribute("vo") CodeGroupVo vo, Model model) throws Exception{
	
//		model.addAttribute("list", service.selectList(vo));

		System.out.println("vo.getShDateStart() : " + vo.getShDateStart());
		System.out.println("vo.getShDateEnd() : " + vo.getShDateEnd());
		System.out.println("=======");
		
		setSearch(vo);
		
		model.addAttribute("list", service.selectList(vo));

//		model.addAttribute("vo", vo);

		return "xdm/v1/infra/codeGroup/codeGroupXdmList";
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
