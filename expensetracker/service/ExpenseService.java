package com.arshaque.expensetracker.service;

import com.arshaque.expensetracker.model.Expense;
import com.arshaque.expensetracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    // Get all expenses (sorted by date descending)
    public List<Expense> getAllExpenses() {
        return repo.findAllByOrderByDateDesc();
    }

    // Add expense
    public Expense addExpense(Expense expense) {
        return repo.save(expense);
    }

    // Delete expense
    public void deleteExpense(Long id) {
        repo.deleteById(id);
    }

    // Find between dates
    public List<Expense> getExpensesBetweenDates(LocalDate start, LocalDate end) {
        return repo.findByDateBetweenOrderByDateDesc(start, end);
    }

    // Sum by category between dates
    public Double getSumByCategoryBetween(LocalDate start, LocalDate end) {
        return repo.sumByCategoryBetween(start, end);
    }
}
