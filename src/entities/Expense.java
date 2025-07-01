package entities;

import entities.enums.Category;

import java.util.Date;

public class Expense {
    private String description;
    private Double value;
    private Date date;
    private Category category;

    public Expense(String description, Double value, Date date, Category category) {
        this.description = description;
        this.value = value;
        this.date = date;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }
}