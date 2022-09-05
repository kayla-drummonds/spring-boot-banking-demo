package com.banking.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.banking.springboot.model.Account;

@Component
public interface AccountService {
	List<Account> getAllAccounts();

	Account getAccountById(Long id);

	Account updateAccount(Account account);

	void deleteAccountById(Long id);

	Account saveAccount(Account account);

	Page<Account> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
