package orderDetailsCons;

public class ProductOrder {
		private String materialname;
		private int supplierID;
		private int warehouseID;
		private String quantityvalueandunit;
		private int priceperunit;
		private String dateofdelivery;

		public ProductOrder(String materialname,int supplierID,int warehouseID,String quantityvalue,int priceperunit,String dateofdelivery){
			this.materialname=materialname;
			this.supplierID=supplierID;
			this.warehouseID=warehouseID;
			this.quantityvalueandunit=quantityvalueandunit;
			this.priceperunit=priceperunit;
			this.dateofdelivery=dateofdelivery;
		}
		public String getMaterialName() {
			return materialname;
		}
		public void setMaterialName(String materialname) {
			this.materialname=materialname;
		}
		public int getSupplierID() {
			return supplierID;
		}
		public void setSupplierID(int supplierID) {
			this.supplierID=supplierID;
		}
		public int getWarehouseID() {
			return warehouseID;
		}
		public void setWarehouseID(int warehouseID) {
			this.warehouseID=warehouseID;
		}
		public String getQuantityValueAndUnit() {
			return quantityvalueandunit;
		}
		public void setQuantityValue(String quantityvalueandunit) {
			this.quantityvalueandunit=quantityvalueandunit;
		}
		public int getPricePerUnit() {
			return priceperunit;
		}
		public void setPricePerUnit(int priceperunit) {
			this.priceperunit=priceperunit;
		}
		public String getDateOfDelivery() {
			return dateofdelivery;
		}
		public void setDateOfDelivery(String dateofdelivery) {
			this.dateofdelivery=dateofdelivery;
		}
		}
