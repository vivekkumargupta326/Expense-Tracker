package com.project.expense.service;

import com.project.expense.dao.ExpenseDao;
import com.project.expense.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    ExpenseDao expenseDao;
    public void addToDb(Expense expense) {
        expenseDao.save(expense);
    }

}
