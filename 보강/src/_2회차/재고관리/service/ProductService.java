package _2회차.재고관리.service;

import java.util.List;

import _2회차.재고관리.model.Product;

/**
 *  재고 관리
 *  - 목록 : list		List<Prodcut>
 *  - 등록 : insert		void, int
 *  - 조회 : select		Product
 *  - 수정 : update		void, int
 *  - 삭제 : delete		void, int
 */
public interface ProductService {

	// 데이터 등록
	Product insert(Product product);
	
	// 데이터 목록
	List<Product> list();
	
	// 데이터 조회
	Product select(String productId);
	
	// 데이터 수정
	int update(Product product);
	
	// 데이터 삭제
	int delete(String productId);	
	

}
