package com.foodmap.infra.codeGroup;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
//	CodeGroupDao codeGroupDao;
	
	@Autowired
	CodeGroupDao dao;
//	CodeGroupDao dao = new CodeGroupDao();
	
//	public List<CodeGroupDto> selectList(){
//		
//		List<CodeGroupDto> list = dao.selectList();
//		
//		return list;
//	}
	
	public List<CodeGroupDto> selectList(){ return dao.selectList();}

//	public CodeGroupDto selectOne(CodeGroupDto dto) {
//		CodeGroupDto codeGroupDto = dao.selectOne(dto);
//		return codeGroupDto;
//	}

	public CodeGroupDto selectOne(CodeGroupDto dto) {
		// TODO Auto-generated method stub
		return dao.selectOne(dto);
	}
	
	public int insert(CodeGroupDto dto) {
		return dao.insert(dto);

	}
	public int update(CodeGroupDto dto) {
		return dao.update(dto);
	}
	
	public int updateDelete(CodeGroupDto dto) {
		return dao.updateDelete(dto);
	}
	
//	public int delete(CodeGroupDto dto, String string, Map<String, Object> commandMap) {
//		return dao.delete(dto);
//	}

	public void delete(String seq) {
		// TODO Auto-generated method stub
		dao.delete(seq);
	}

}