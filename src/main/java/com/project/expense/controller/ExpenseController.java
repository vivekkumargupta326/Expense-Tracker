package com.project.expense.controller;

import com.project.expense.model.Expense;
import com.project.expense.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;
    @PostMapping("/add")
    public ModelAndView add(Expense expense)
    {
        ModelAndView mv = new ModelAndView("AddExpense.jsp");
        expenseService.addToDb(expense);
        mv.addObject("message","Added successfully");
        return mv;
    }

    @GetMapping("/home")
    public String home()
    {
        return "Home.jsp";
    }

}
