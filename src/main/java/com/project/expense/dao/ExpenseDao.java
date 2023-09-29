package com.project.expense.dao;

import com.project.expense.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseDao extends JpaRepository<Expense,Long> {

}
