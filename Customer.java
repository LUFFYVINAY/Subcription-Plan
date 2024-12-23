package lld.factory;

public class Customer {
	public String  Id;
	public Subscription subscription;
	
	public Customer(String Id) {
		this.Id =Id;
		
	}
	public void subscriblePlan(Subscription subscription) {
		this.subscription =subscription;
		this.subscription.addSubscription(this);
		
	}
	
	public void removePlan() {
		
		this.subscription.removeSubscription(this);
	}
	
	public void updatePlan(Subscription newsubscription) {
		subscription.removeSubscription(this);
        this.subscription = newsubscription;
        this.subscription.updateSubscription(this);
	}
}
