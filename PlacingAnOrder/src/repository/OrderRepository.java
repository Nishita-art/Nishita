package repository;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import orderDetailsCons.Order;
public class OrderRepository {
private OrderRepository()
{
}
static Map<Integer,Order> orderMap = new HashMap<Integer,Order>();
static {
	orderMap.put(1,new Order("Sugar",1,10,"3 grams",200,"23 feb 2020"));
	orderMap.put(2,new Order("Wood",2,20,"5 grams",400,"20 feb 2020"));
	orderMap.put(3,new Order("Fevicol",3,30,"10 grams",800,"27 feb 2020"));
}
public static Map<Integer,Order>get()
{
	return orderMap;
}
}
