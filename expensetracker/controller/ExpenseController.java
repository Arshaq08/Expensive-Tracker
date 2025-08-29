package com.arshaque.expensetracker.controller;

import com.arshaque.expensetracker.model.Expense;
import com.arshaque.expensetracker.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    // Get all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

    // Add new expense
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return service.addExpense(expense);
    }

    // Delete expense by ID
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
    }

    // Get expenses between dates
    @GetMapping("/between")
    public List<Expense> getExpensesBetweenDates(
            @RequestParam LocalDate start,
            @RequestParam LocalDate end) {
        return service.getExpensesBetweenDates(start, end);
    }

    // Get sum of expenses between dates
    @GetMapping("/sum")
    public Double getSumByCategoryBetween(
            @RequestParam LocalDate start,
            @RequestParam LocalDate end) {
        return service.getSumByCategoryBetween(start, end);
    }
}
