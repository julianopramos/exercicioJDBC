package br.com.program;

import br.com.model.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {
	
	public static void main(String[] args) {
			
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(9);
		
		System.out.println(seller);
		
	}
}
