package com.foodmap.infra.codeGroup;

import java.util.List;


public interface CodeGroupDao {
	public List<CodeGroupDto> selectList(); // 관례적으로 목록을 가져오는 함수 이름은 selectList를 주로 씀

	public CodeGroupDto selectOne(CodeGroupDto dto); // 데이터 하나만 리턴할 때에는 list가 아닌 dto로 가져옴
	public int insert(CodeGroupDto dto); // 데이터 하나만 리턴할 때에는 list가 아닌 dto로 가져옴

	public int update(CodeGroupDto dto);
	public int updateDelete(CodeGroupDto dto);
	public int delete(CodeGroupDto dto);
	public void delete(String seq);
    public List<CodeGroupDto> selectList(CodeGroupVo vo);
}
