package application;

import entities.Expense;
import entities.Portfolio;
import entities.User;
import entities.enums.Category;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        // Exemplo de uso do sistema de controle de despesas

        System.out.println("Bem-vindo ao sistema de controle de despesas!");

        // Cadastro do usuário

        System.out.print("Digite o seu nome: ");
        String name = sc.nextLine();
        System.out.print("Digite o seu email: ");
        String email = sc.nextLine();
        System.out.print("Digite o seu CPF (apenas números): ");
        String cpf = sc.nextLine();

        User user = new User(name, email, cpf);

        System.out.println("Usuário cadastrado com sucesso!");

        System.out.print("Digite o saldo inicial: ");
        Double initialBalance = sc.nextDouble();
        sc.nextLine();

        Portfolio portfolio = new Portfolio(initialBalance, user);

        int option = 0;

        do {
            System.out.println("Menu:\n1 - Adicionar despesa\n2 - Calcular saldo\n3 - Filtrar despesas por categoria\n4 - Resumo por mês e ano\n5 - Mostrar Todas as Despesas\n6 - Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine();

            /*
            sistema de controle de despesas
             * 1 - Adicionar despesa
             * 2 - Calcular saldo
             * 3 - Filtrar despesas por categoria
             * 4 - Resumo por mês e ano
             * 5 - Mostrar Todas as Despesas
             * 6 - Sair
             */

            switch (option) {
                case 1:
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                    System.out.println("Adicionar despesa:");
                    System.out.print("Descrição: ");
                    String description = sc.nextLine();
                    System.out.print("Valor: ");
                    Double value = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Data (dd/MM/yyyy): ");
                    String dateInput = sc.nextLine();
                    System.out.print("Categoria (ALIMENTACAO, LAZER, TRANSPORTE, SAUDE, EDUCACAO, OUTROS): ");
                    Category category = Category.valueOf(sc.nextLine().toUpperCase());

                    Expense expense = new Expense(description, value, sdf.parse(dateInput), category);
                    portfolio.addExpense(expense);
                    System.out.println("Despesa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("Saldo atual: " + portfolio.calculateBalance());
                    break;
                case 3:
                    System.out.println("Filtrar despesas por categoria:");
                    System.out.print("Categoria (ALIMENTACAO, LAZER, TRANSPORTE, SAUDE, EDUCACAO, OUTROS): ");
                    Category filterCategory = Category.valueOf(sc.nextLine().toUpperCase());
                    Double totalPerCategory = portfolio.filterPerCategory(filterCategory);
                    System.out.println("Total de despesas na categoria " + filterCategory + ": " + totalPerCategory);
                    break;
                case 4:
                    System.out.println("Resumo por mês e ano:");
                    System.out.print("Mês (01-12): ");
                    int month = sc.nextInt();
                    System.out.print("Ano: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    Double totalPerMonthAndYear = portfolio.resumePerMonthandYear(month, year);
                    System.out.println("Total de despesas em " + month + "/" + year + ": " + totalPerMonthAndYear);
                    break;
                case 5:
                    System.out.println("Todas as despesas:");
                    System.out.println(portfolio);
                    break;
                case 6:
                    System.out.println("Saindo do sistema. Obrigado por usar o controle de despesas!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }
        } while (option != 6);
    }
}