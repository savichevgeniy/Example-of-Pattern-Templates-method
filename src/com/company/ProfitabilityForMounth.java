package com.company;
//Подкласс наслдеующий методы от суперкласса со схемой расчета показателей (суть паттерна)
public class ProfitabilityForMounth extends CalculateScheme {
    //Так как данный класс служит для рассчета показателей рентабельностми за месяц, используются следующие переменные
    private String period = "месяц";
    //Количество месяцев для цикла for
    private final int quantityMonths = 1;
    private double income, costs, result = 0;
    public void ShowProfitability() {
        ShowMessage(period);
        income = InputIncome(quantityMonths);
        costs = InputCosts(quantityMonths);
        result = CalculateProfitability(income, costs);
        ShowResult(period, result);
    }
}
