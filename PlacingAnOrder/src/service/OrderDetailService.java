package service;
import access_Details.OrderDetails;

import java.util.*;

import Exception.NoDataFoundException;

public class OrderDetailService {
	
OrderDetails orderDaoObj = new OrderDetails();

List<Integer>IDList = new ArrayList<Integer>();

public List<Integer> getID(){
	IDList = orderDaoObj.getIDs();
	return IDList;
}
public String getOrderDetails(Integer supplierID) throws NoDataFoundException{
	String result=null;
	for(Integer i : IDList) {
		if(i.equals(supplierID)) {
			result = orderDaoObj.getOrderDetails(supplierID);
		}
	}
	if(result == null) {
		throw new NoDataFoundException("It is not a valid ID");
	}
	else {
		return result;
	}
}
}
