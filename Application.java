package lld.factory;

public class Application {
	 static public Database dataBase;

	    public static void main(String[] arg) {
	        dataBase = new Database();
	        Customer customer1 = new Customer("1");
	        Customer customer2 = new Customer("2");
	        Customer customer3 = new Customer("3");

	        customer1.subscriblePlan(new Gold(dataBase));
	        customer2.subscriblePlan(new Silver(dataBase));
	        customer1.updatePlan(new Royal(dataBase));
	        customer3.subscriblePlan(new Silver(dataBase));
	        customer2.removePlan();
	    

	    }
}
