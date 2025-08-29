package com.arshaque.expensetracker.repository;

import com.arshaque.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // Get all expenses sorted by date
    List<Expense> findAllByOrderByDateDesc();

    // Get expenses between two dates
    List<Expense> findByDateBetweenOrderByDateDesc(LocalDate start, LocalDate end);

    // Custom query to sum expenses by category between two dates
    @Query("SELECT SUM(e.amount) FROM Expense e WHERE e.date BETWEEN :start AND :end")
    Double sumByCategoryBetween(LocalDate start, LocalDate end);
}
