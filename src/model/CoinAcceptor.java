package model;

import interfaces.MoneyAcceptor;
import java.util.Scanner;

public class CoinAcceptor implements MoneyAcceptor {
    private int amount;

    public CoinAcceptor(int initialAmount) {
        this.amount = initialAmount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void receiveMoney() {
        System.out.println("Введите сумму монет для пополнения:");
        Scanner scanner = new Scanner(System.in);
        try {
            int inserted = Integer.parseInt(scanner.nextLine().trim());
            if (inserted > 0) {
                this.amount += inserted;
                System.out.println("Баланс пополнен");
            } else {
                System.out.println("Сумма должна быть больше нуля");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: ведите число!");
        }
    }
}