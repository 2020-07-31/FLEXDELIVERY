package com.project.fd.admin.gift.model;

import java.util.List;

public interface AdminGiftProductService {
	List<AdminGiftProductVO> selectAll();

	List<AdminGiftCategoryProductVO> selectAll2();
	
	int insertGiftProduct(AdminGiftProductVO giftProductVo);
	
	int updateGiftProduct(AdminGiftProductVO giftProductVo);
	
	int deleteGiftProduct(AdminGiftProductVO giftProductVo);

	boolean checkDu(String gProductName);

	List<AdminGiftCategoryProductVO> selectForAll2(int categoryNo);
	
	
}
