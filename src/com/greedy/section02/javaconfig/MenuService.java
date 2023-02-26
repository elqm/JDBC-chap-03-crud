package com.greedy.section02.javaconfig;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static com.greedy.section02.javaconfig.Template.getSqlSession;

public class MenuService {

	public List<MenuDTO> findAllMenus() {

		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		List<MenuDTO> menuList = menuMapper.selectAllMenu();
		
		sqlSession.close();
		
		return menuList;
	}

	public MenuDTO findMenuByMenuCode(int code) {

		return null;
	}

	public boolean registNewMenu(MenuDTO menu) {

		return false;
	}

	public boolean updateNewMenu(MenuDTO menu) {

		return false;
	}

	public boolean deleteMenuByCode(int code) {

		return false;
	}

}
