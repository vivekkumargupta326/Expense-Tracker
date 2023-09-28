package com.project.expense.controller;

import com.project.expense.model.Expense;
import com.project.expense.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;
    @PostMapping("/add")
    public Expense add(@RequestBody Expense expense)
    {
        return expenseService.addToDb(expense);
    }

    @GetMapping("/home")
    public String home()
    {
        return "WELCOME TO EXPENSE TRACKER";
    }

}
