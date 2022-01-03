package br.com.program;

import java.util.Date;

import br.com.model.entities.Department;
import br.com.model.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {
	
	public static void main(String[] args) {
		
		Department dp = new Department(1,"Books");
		Seller seller = new Seller (21, "Bob", "Bob@gmail.com", new Date(), 3000.0, dp);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
		
	}
}
