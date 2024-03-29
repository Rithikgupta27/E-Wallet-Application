package com.ePay.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ePay.model.BankAccount;
import com.ePay.model.Customer;

@Service
public interface AccountService {
	public Customer addAccount(BankAccount Account, String uniqueId);

	public Customer deleteAccount(Integer accountId, String uniqueId);

	public BankAccount ViewAccount(String accountNo, String uniqueId);

	public List<BankAccount> ViewAllAccount(String walletId, String uniqueId);

	// showBalance: Prashant Anand
	public String showBalance(String mobileNo);
}
