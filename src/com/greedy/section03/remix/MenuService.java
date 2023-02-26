package com.greedy.section03.remix;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static com.greedy.section03.remix.Template.getSqlSession;

public class MenuService {

	public List<MenuDTO> findAllMenus() {

		SqlSession sqlSession = getSqlSession();
//		System.out.println(sqlSession);
		
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		
		List<MenuDTO> menuList = menuMapper.selectAllMenu();
		
		sqlSession.close();
		
		return menuList;
	}

	public MenuDTO findMenuByMenuCode(int code) {

		SqlSession sqlSession = getSqlSession();
		
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		MenuDTO menu = menuMapper.selectMenuByCode(code);
		
		sqlSession.close();
		
		return menu;
	}

	public boolean registNewMenu(MenuDTO menu) {

		SqlSession sqlSession = getSqlSession();
		
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		int result = menuMapper.insertMenu(menu);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public boolean updateNewMenu(MenuDTO menu) {

		SqlSession sqlSession = getSqlSession();
		
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		int result = menuMapper.updateMenu(menu);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public boolean deleteMenuByCode(int code) {

		SqlSession sqlSession = getSqlSession();
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		int result = menuMapper.deleteMenu(code);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

}
