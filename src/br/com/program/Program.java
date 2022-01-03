package br.com.program;

import br.com.model.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {
	
	public static void main(String[] args) {
			
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste 1 - findById ===");
		Seller seller = sellerDao.findById(9);
		
		System.out.println(seller);
		
	}
}
