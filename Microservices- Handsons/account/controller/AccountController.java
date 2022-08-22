package com.account.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.Account;

@RestController
public class AccountController {
	private static Map<String, List<Account>> accountDB = new HashMap<String, List<Account>>();
	
	static {
		List<Account> type1 = new ArrayList<>();
		type1.add(new Account(1237845323, "savings", 78987));
		type1.add(new Account(1237843112, "savings", 18980));
		type1.add(new Account(1237866751, "current", 3487));
		accountDB.put("xyzbank", type1);
		
		List<Account> type2 = new ArrayList<>();
		type2.add(new Account(445568776, "current", 65754));
		type2.add(new Account(445534218, "savings", 9754));
		type2.add(new Account(445590977, "savings", 8965));
		accountDB.put("qwebank", type2);
	}
	
	@RequestMapping(value = "/accounts/{accNum}", method = RequestMethod.GET)
	public List<Account> getAccountdetails(@PathVariable long accNum ){
		List<Account> accList = accountDB.get(accNum);
		return accList;
	}
}
