package assignment;

import java.util.*;

class Product {
	
	int  product_id;
	double price;
	
	public Product(int product_id, double price) {
		this.product_id = product_id;
		this.price = price;
	}
	
	public int getName() {
		return product_id;
	}
	public void setName(int product_id) {
		this.product_id = product_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}


public class productFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Product> list = new ArrayList<>();
	        list.add(new Product(1, 1.58));
	        list.add(new Product(2, 1.45));
	        list.add(new Product(3, 2.25));
	        list.add(new Product(4, 2.58));

	        Double ans = list.stream().filter(p -> p.price < 2.5).mapToDouble
	                (p -> p.price).average().orElse(0);

	        System.out.println(ans);
	}

}
