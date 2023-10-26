package ru.netology.hwCycles.services;

public class MoneyService {

    // income - доход от работы
    //expenses - обяз траты
    // threshold - кол-во денег для отдыха
    public int calcMoney(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
    }


