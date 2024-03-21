package com.foodmap.infra.member;

import java.util.*;

public interface MemberDao {
	public List<MemberDto> selectList(MemberVo vo); // 관례적으로 목록을 가져오는 함수 이름은 selectList를 주로 씀

	public MemberDto selectOne(MemberDto dto); // 데이터 하나만 리턴할 때에는 list가 아닌 dto로 가져옴

}
