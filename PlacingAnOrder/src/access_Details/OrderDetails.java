package access_Details;
import java.util.*;

import orderDetailsCons.Order;

import repository.OrderRepository;
import java.util.Map;
public class OrderDetails {
Map<Integer,Order> repositoryMap;
 // Constructor
public OrderDetails() {
	repositoryMap = OrderRepository.get();
}
// this function gets the order IDs and returns the List
public List<Integer> getIDs(){
	List<Integer> supplierIDList = new ArrayList<Integer>();
	for(Map.Entry<Integer, Order> obj: repositoryMap.entrySet()) {
		supplierIDList.add(obj.getKey());
	}
	return supplierIDList;
}
// this function gives the result by validating the Id
public String getOrderDetails(Integer supplierID) {
	String result = null;
	for(Map.Entry<Integer,Order> obj : repositoryMap.entrySet())
	{
		if(obj.getKey().equals(supplierID))
		{
			result =obj.getValue().getSupplierID()+"\n" +obj.getValue().getWarehouseID()+"\n"+obj.getValue().getMaterialName()+"\n"+obj.getValue().getQuantityValueAndUnit()+
					"\n"+obj.getValue().getPricePerUnit()+"\n"+obj.getValue().getDateOfDelivery();
			result="Placed successfully";
		}
	}
	return result;
}
}
