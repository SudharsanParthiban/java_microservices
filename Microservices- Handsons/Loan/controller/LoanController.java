package com.Loan.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Loan.model.Loan;

@RestController
public class LoanController {
	
	private static Map<String, List<Loan>> LoanDB = new HashMap<String, List<Loan>>();
	
	static {
		List<Loan> type1 = new ArrayList<>();
		type1.add(new Loan(1237845323, "car", 78987));
		type1.add(new Loan(1237843112, "home", 18980));
		type1.add(new Loan(1237866751, "bike", 3487));
		LoanDB.put("xyzbank", type1);
		
		List<Loan> type2 = new ArrayList<>();
		type2.add(new Loan(445568776, "business", 65754));
		type2.add(new Loan(445534218, "education", 9754));
		type2.add(new Loan(445590977, "house", 8965));
		LoanDB.put("qwebank", type2);
	}
	
	@RequestMapping(value = "/loans/{accNum}", method = RequestMethod.GET)
	public List<Loan> getAccountdetails(@PathVariable long accNum ){
		List<Loan> accList = LoanDB.get(accNum);
		return accList;
	}

}
