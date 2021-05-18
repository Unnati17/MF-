package newAOP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("newacc")
public class AccountDao {
	private String name;
	private String serviceCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	
	public List<Account> findAccounts() {
		
		List<Account> myAccounts = new ArrayList<>();
		
		Account temp1 = new Account("Harry", "Platinum");
		Account temp2 = new Account("John", "Silver");
		Account temp3 = new Account("Angelia", "Gold");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;		
	}
}