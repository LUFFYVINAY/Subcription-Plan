package lld.factory;

import java.util.*;

public class Database {
	private  HashMap<String, String> CustomerList;
	
	public Database() {
		CustomerList = new HashMap<>();
	}
	
	public void addSubscriptionToDataBase(String CustomerId , String SubscriptionType) {
		if(!CustomerList.containsKey(CustomerId)) {
			CustomerList.put(CustomerId, SubscriptionType);
			System.out.println("Customer sucessfully");
		}
	}
	
	public void removeSubscriptionFromDatabase(String CustomerId) {
		if(CustomerList.containsKey(CustomerId)) {
			CustomerList.remove(CustomerId);
			System.out.println("Customer Removed successfully");
		}
	}
	public void updateSubscriptionToDataBase(String CustomerId , String SubscriptionType) {
		if(!CustomerList.containsKey(CustomerId)) {
			
			System.out.println("Cusomter did not exist ");
		}
		if(CustomerList.containsKey(CustomerId)) {
			CustomerList.put(CustomerId, SubscriptionType);
			System.out.println("Customer Updaed successfully");
		}
	}
	
}
