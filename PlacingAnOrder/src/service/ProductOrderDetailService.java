package service;
import java.util.ArrayList;
import java.util.List;

import Exception.NoDataFoundException;
import access_Details.ProductOrderDetails;

public class ProductOrderDetailService {
	ProductOrderDetails productorderDaoObj = new ProductOrderDetails();

	List<Integer>IDList = new ArrayList<Integer>();

	public List<Integer> getID(){
		IDList = productorderDaoObj.getIDs();
		return IDList;
	}
	public String getProductOrderDetails(Integer supplierID) throws NoDataFoundException{
		String result=null;
		for(Integer i : IDList) {
			if(i.equals(supplierID)) {
				result = productorderDaoObj.getProductOrderDetails(supplierID);
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
