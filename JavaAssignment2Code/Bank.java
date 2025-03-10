// Galagamage Dilmi Nadisha Wickramarathna

package paradis.assignment2;

import java.util.List;
import java.util.ArrayList;

class Bank {
	// Instance variables.
	private final List<Account> accounts = new ArrayList<Account>();
	
	// Instance methods.

	int newAccount(int balance) {
		int accountId = accounts.size();
		accounts.add(new Account(accountId, balance));
		return accountId;
	}
	
	Account getAccount(int accountId) {
		Account account = accounts.get(accountId);
		return account;
	}
}
