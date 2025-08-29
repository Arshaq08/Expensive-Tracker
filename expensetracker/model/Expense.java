package com.arshaque.expensetracker.model;


import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Category is required")
    private String category;

    @Positive(message="Amount must be > 0")
    private double amount;

    @NotBlank(message="Description is required")
    private String description;

    @NotNull(message="Date is required")
    private LocalDate date;

    public Expense() {}

    public Expense(String category, double amount, String description, LocalDate date) {
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    // getters & setters
    public Long getId() { return id; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }

    public void setId(Long id) { this.id = id; }
    public void setCategory(String category) { this.category = category; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDescription(String description) { this.description = description; }
    public void setDate(LocalDate date) { this.date = date; }
}
