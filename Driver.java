public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Todd= new BankAccount("Todd Davis", 100, 0.05);
		BankAccount Katie = new BankAccount("Katie Harris",10000.01, 0.016);
		BankAccount BigBrain = new BankAccount();
		System.out.println("I will call everyone's bank accounts");
		System.out.println(Katie);
		System.out.println(Todd);
		System.out.println(BigBrain);
		System.out.println("I will test the getters to see if they work");
	
		System.out.println(Todd.getBalance());
		System.out.println(Todd.getName());
		System.out.println(Todd.getInterestRate());
		System.out.println("I will test the setters, it should be name:Todd Harris, balance 10000.001, interestRate:0.016001");
		Todd.setName("Todd Harris");
		Todd.setBalance(10000.009);
		Todd.setInterestRate(0.01609);
		System.out.println(Todd);
		System.out.println("I will test the .equals method with Katie and Todd");
		System.out.println(Todd.equals(Katie));
		System.out.println("I will test the apply interest method on Katie's bankAccount");
		Katie.applyInterest();
		System.out.println(Katie.getBalance());
		System.out.println("I will test the withdraw methods on Todd with -60,50, and 200000 dollar amounts");
		System.out.println(Todd.withdraw(-60));
		System.out.println(Todd.withdraw(50));
		System.out.println(Todd.withdraw(200000));
		System.out.println("This is Todd's balance");
		System.out.println(Todd.getBalance());
		
		System.out.println("I will test the deposit method on Katie with -60 and 50");
		System.out.println(Katie.deposit(-10));
		System.out.println(Katie.deposit(10));
		System.out.println("this is Katies's balance");
		System.out.println(Katie.getBalance());
		System.out.println("this is testing the bankaccount with default values");
		System.out.println(BigBrain);
		System.out.println("This is testing a transfer from Katie to Todd for values of 60 dollars, -1 dollar, and 300000 dollars" );
		System.out.println(Katie.transfer(Todd, 60));
		System.out.println(Katie.transfer(Todd, -1));
		System.out.println(Katie.transfer(Todd, 300000));
		System.out.println("Now this is both of their balances");
		System.out.println(Todd.getBalance());
		
		System.out.println(Katie.getBalance());
		System.out.println("I will now calculate the balance of Todd and Katie's bank account Todd:40 years and Katie:-1 years");
		System.out.println(Todd.calculateBalance(40));
		
		System.out.println(Katie.calculateBalance(-1));
		System.out.println("I will test if Todd equals BigBrain");
		System.out.println(Todd.equals(BigBrain));
		System.out.println("I will apply the interest to Todd");
		Todd.applyInterest();
		System.out.println("This is his current balance");
		System.out.println(Todd.getBalance());
		System.out.println("I will test an invalid deposit of -100 to see if it works or not");
		if(Todd.deposit(-100)) {
			System.out.println(Todd);
		}else {
			System.out.println("invalid");
		}
		
		
		

	}
}

		
		

	
