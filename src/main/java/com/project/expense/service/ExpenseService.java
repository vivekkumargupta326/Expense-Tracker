package com.project.expense.service;

import com.project.expense.dao.ExpenseDao;
import com.project.expense.model.Expense;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    ExpenseDao expenseDao;
    public boolean addToDb(Expense expense) {
    	if(expense.getDay() < 1 || expense.getDay() > 31)
    	{
    		return false;
    	}
    	if(expense.getMonth() < 1 || expense.getMonth() > 12)
    	{
    		return false;
    	}
    	//provide check for months having 30 and 31 days...if april then day should not exceed 30.
    	
    	//provide more checks for year and cost too.
    	
        expenseDao.save(expense);
        return true;
    }

}
