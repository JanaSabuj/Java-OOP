class BankAccount {
	int AccountNumber;
	float balance;
	String ownerName;

	BankAccount(){}

	BankAccount(int an, float b, String on){
		AccountNumber = an;
		balance = b;
		ownerName = on;
	}

	float Balance(){
		return balance;
	}

	void add(float val){
		balance += val;
	}

	void subtract(float val){
		if(balance < val)
			System.out.println("Insufficent balance");
		else
			balance -= val;
	}
}

class AccountManager {
	BankAccount arr[];
	int cnt;
	int total;

	AccountManager(int n){
		arr = new BankAccount[n];
		cnt = 0;
		total = n;
	}

	void create(int an, float b, String on){
		if(cnt >= total){
			System.out.println("No more accounts can be added");
			return ;
		}
		arr[cnt++] = new BankAccount(an, b, on);
	}

	void delete(int an){
		for(int i = 0; i < total; i++){
			if(arr[i] != null)
			if(arr[i].AccountNumber == an)
				arr[i] = null;
		}
	}

	void deposit(int an, float val){
		for(int i = 0; i < total; i++){
			if(arr[i] != null)
			if(arr[i].AccountNumber == an)
				arr[i].add(val);
		}
	}

	void withdraw(int an, float val){
		for(int i = 0; i < total; i++){
			if(arr[i] != null)
			if(arr[i].AccountNumber == an)
				arr[i].subtract(val);
		}
	}

	void display(int an){
		for(int i = 0; i < total; i++){
			if(arr[i] != null)
			if(arr[i].AccountNumber == an){
				System.out.println("Account Number: " + arr[i].AccountNumber);
				System.out.println("Account Balance: " + arr[i].balance);
				System.out.println("Account Name: " + arr[i].ownerName);
			}
		}
	}
}

class Bank{
	public static void main(String args[]){
		AccountManager sbi = new AccountManager(5);
		sbi.create(100,5000, "Messi");
		sbi.create(101,6000, "Xavi");
		sbi.create(102,7000, "Ronaldo");
		sbi.create(103,8000, "Salah");
		sbi.create(104,9000, "Rooney");

		sbi.deposit(100, 500.67f);
		sbi.deposit(101, 500.76f);

		sbi.withdraw(100, 50.50f);

		sbi.delete(100);

		sbi.display(103);
		sbi.display(101);

	}
}