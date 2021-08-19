public class BankAccount {
private String name; private double balance; private double interestRate;

public BankAccount() {
	name="default";
	balance=00;
	interestRate=00;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public double getInterestRate() {
	return interestRate;
}

public void setInterestRate(double intrestRate) {
	this.interestRate = intrestRate;
}

public BankAccount(String name, double balance, double intrestRate) {
	
	this.name = name;
	this.balance = balance;
	this.interestRate = intrestRate;
}
public String toString() {
	String toOutput="";
	toOutput+="name: "+name+", ";
	toOutput+="balance: "+balance+", ";
	toOutput+="interest rate: "+interestRate*100+" percent";
	return toOutput;
}
public boolean deposit(double deposit) {
	if(deposit<0)
		return false;
	else {
		balance+=deposit;
		return true;
	}
}
public boolean withdraw(double withdraw) {
	if(withdraw<0||withdraw>balance)
		return false;
	else {
		balance-=withdraw;
		return true;
	}
}
public void applyInterest() {
	balance+=interestRate*balance;
}
public double calculateBalance(double years) {
	if(years<0) {
		return 0;
	}else
	return balance*Math.pow(1+interestRate, (int)years);
}
public boolean transfer(BankAccount receiver, double transfer) {
	if(transfer>this.balance||transfer<0)
		return false;
	else {
		receiver.balance+=transfer;
		this.balance-=transfer;
		return true;
	}
}
public boolean equals(BankAccount account) {
	if(this.balance-account.balance<0.01&&this.balance-account.balance>-0.01&&this.interestRate-account.interestRate<0.0001&&this.interestRate-account.interestRate>-0.0001) {
		return true;
	}else
		return false;
}}