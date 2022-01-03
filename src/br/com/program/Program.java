package br.com.program;

import java.util.List;

import br.com.model.entities.Department;
import br.com.model.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {
	
	public static void main(String[] args) {
			
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste 1 - findById ===");
		Seller seller = sellerDao.findById(9);
		
		System.out.println(seller);
		
		System.out.println("=== Teste 2 - findByDepartment ===");
		Department department = new Department (1, null);
		List<Seller> sels = sellerDao.findByDepartment(department);
		
		for(Seller s : sels) {
			System.out.println(s);
		}
		
		System.out.println("=== Teste 3 - findAll ===");
		List<Seller> sellers = sellerDao.findAll();
		
		for(Seller s : sellers) {
			System.out.println(s);
		}
		
	}
}
