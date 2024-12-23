package lld.factory;

public class Silver implements Subscription {
	
	Database  database;
	
	public Silver(Database database) {
		this.database = database;
	}
	
	@Override
	public String subscriptionType() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}

	@Override
	public boolean addSubscription(Customer customer) {
		// TODO Auto-generated method stub
		database.addSubscriptionToDataBase(customer.Id,"Royal");
		System.out.println("Silver plan added sucessfully");
		return true;
	}

	@Override
	public boolean removeSubscription(Customer customer) {
		// TODO Auto-generated method stub
		database.removeSubscriptionFromDatabase(customer.Id);
		System.out.println("Silver plan removed  sucessfully");
		return true;
	}

	@Override
	public boolean updateSubscription(Customer customer) {
		// TODO Auto-generated method stub
		database.updateSubscriptionToDataBase(customer.Id, "Royal");
		System.out.println("Silver plan updated sucessfully");
		return true;
	}

}
