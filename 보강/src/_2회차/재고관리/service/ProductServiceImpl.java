package _2회차.재고관리.service;

import java.util.List;

import _2회차.재고관리.model.Product;
import _2회차.재고관리.model.ProductDAO;

public class ProductServiceImpl implements ProductService {

	
	public static ProductDAO dao = new ProductDAO();
	//화이팅
	
	// 홍준범
	@Override
	// * 재고목록
	public List<Product> list() {
		return dao.list();
	}
    
	
	// 어려워요 
	// * 재고 등록
	@Override
	public int insert(Product product) {
		dao.insert(product);
		return 1;
	}

	
	// AK47
	// * 재고 조회
	@Override
	public Product select(String productId) {
		//조회
		Product product = dao.select(productId);
		
		return product;
	}

	
	// KYJ 수정
	// * 재고 수정
	@Override
	public int update(Product product) {
        dao.update(product);
		return 1;
	}

	
	// pse
	// * 재고 삭제
	@Override
	public int delete(String productId) {
		dao.delete(productId);
		return 1;
	}

						
						
}
