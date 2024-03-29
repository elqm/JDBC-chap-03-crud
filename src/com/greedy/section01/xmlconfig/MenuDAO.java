package com.greedy.section01.xmlconfig;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MenuDAO {

	public List<MenuDTO> selecAllMenu(SqlSession sqlSession) {

		return sqlSession.selectList("MenuMapper.selectAllMenu");
	}

	public MenuDTO selectMenuByCode(SqlSession sqlSession, int code) {

		return sqlSession.selectOne("MenuMapper.selectMenuByCode", code);
		
	}

	public int insertMenu(SqlSession sqlSession, MenuDTO menu) {
		
		return sqlSession.insert("MenuMapper.insertMenu", menu);
	}

	public int updateMenu(SqlSession sqlSession, MenuDTO menu) {

		return sqlSession.update("MenuMapper.updateMenu", menu);
	}

	public int deleteMenuByCode(SqlSession sqlSession, int code) {
		
		return sqlSession.delete("MenuMapper.deleteMenu", code);
		
	}

	
	
}
