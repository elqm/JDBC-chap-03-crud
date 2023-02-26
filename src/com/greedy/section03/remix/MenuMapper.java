package com.greedy.section03.remix;

import java.util.List;

public interface MenuMapper/* DAO 패키지에 넣기 */ {

	List<MenuDTO> selectAllMenu();

	MenuDTO selectMenuByCode(int code);

	int insertMenu(MenuDTO menu);

	int updateMenu(MenuDTO menu);

	int deleteMenu(int code);
	
}
