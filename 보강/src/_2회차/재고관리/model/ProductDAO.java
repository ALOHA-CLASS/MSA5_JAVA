package _2회차.재고관리.model;

import java.util.ArrayList;
import java.util.List;

/**
 *  재고 관리 데이터 접근 객체
 *  - 재고 목록
 *  - 재고 등록
 *  - 재고 조회
 *  - 재고 수정
 *  - 재고 삭제
 */
public class ProductDAO {
	// 재고 목록을 담을 컬렉션
	static List<Product> productList = new ArrayList<Product>();
	
	/**
	 * 재고 목록
	 * @return
	 */
	public List<Product> list() { 
		System.out.println("재고목록...");
		return productList;
	}
	
	
	/**
	 * 재고 등록
	 * @param product
	 */
	public void insert(Product product) {
		System.out.println("재고등록...");
		productList.add(product);
	}
	
	/**
	 * 재고 조회
	 * @param productId
	 * @return
	 */
	public Product select(String productId) {
		
		for (Product product : productList) {
			// productId 를 찾으면 반환
			if( product.getProductId().equals(productId) ) {
				return product;
			}
		}
		return null;
	}
	
	
	/**
	 * 재고 수정
	 * @param product
	 */
	public void update(Product product) {
		
		String productId = product.getproductId();
		
		for (Product item : productList) {
			if( item.getproductId().equals(productId) ) {
				item = product;
			}
		}
		
	}
	
	/**
	 * 재고 삭제
	 * @param productId
	 */
	public void delete(String productId) {

		for (int i = 0; i < productList.size(); i++) {
			if( productList.get(i).getProductId().equals(productId) ) {
				productList.remove(productList.get(i));
			}
		}
	}
	
	

}















