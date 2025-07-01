package entities;

import entities.enums.Category;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Portfolio {
    private Double balance = 0.0;
    private List<Expense> expenses = new ArrayList<>();
    private User user;

    public Portfolio(Double balance, User user) {
        this.balance = balance;
        this.user = user;
    }

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    public Double calculateBalance() {
        double total = balance;
        for (Expense expense : expenses) {
            total -= expense.getValue();
        }
        return total;
    }


    public Double filterPerCategory(Category category) {
        Double totalPerCategory = 0.0;

        if (this.expenses.isEmpty()) {
            return totalPerCategory;
        } else {
            for (Expense expense : expenses) {
                if (expense.getCategory() == category) {
                    totalPerCategory += expense.getValue();
                }
            }

            return totalPerCategory;
        }
    }

    public Double resumePerMonthandYear(int month, int year) {
        Double total = 0.0;
        for (Expense expense : expenses) {
            Date date = expense.getDate();

            if ((date.getMonth() + 1) == month && (date.getYear() + 1900) == year) {
                total += expense.getValue();
            }
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Dados do usuário: ").append(user.getName()).append("\n").append("CPF: ").append(user.getCpf()).append("\n").append("Email: ").append(user.getEmail()).append("\n").append("Dados das despesas:\n");
        for (Expense expense : expenses) {
            sb.append("Descrição: ").append(expense.getDescription()).append(", Valor: ").append(expense.getValue()).append(", Data: ").append(expense.getDate()).append(", Categoria: ").append(expense.getCategory()).append("\n");
        }
        sb.append("Saldo atual: ").append(calculateBalance()).append("\n");
        return sb.toString();
    }
}