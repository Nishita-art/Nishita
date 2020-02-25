package repository;
import java.util.*;

import orderDetailsCons.ProductOrder;
public class ProductOrderRepository {
	private ProductOrderRepository()
	{
	}
	static Map<Integer,ProductOrder> productorderMap = new HashMap<Integer,ProductOrder>();
	static {
		productorderMap.put(1,new ProductOrder("Novel",1,10,"3 grams",200,"23 feb 2020"));
		productorderMap.put(2,new ProductOrder("Skirt",2,20,"5 grams",400,"20 feb 2020"));
		productorderMap.put(3,new ProductOrder("Shirt",3,30,"10 grams",800,"27 feb 2020"));
		productorderMap.put(4,new ProductOrder("Bracelet",4,40,"15 grams",1400,"26 feb 2020"));
		productorderMap.put(5,new ProductOrder("Ring",5,50,"8 grams",1000,"25 mar 2020"));
		productorderMap.put(6,new ProductOrder("Jacket",6,60,"9 grams",1300,"3 april 2020"));
	}
	public static Map<Integer,ProductOrder>get()
	{
		return productorderMap;
	}
	}
