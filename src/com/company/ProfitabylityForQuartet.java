package com.company;
//Клас расчета показателей за квартал (3 месяца)
public class ProfitabylityForQuartet extends CalculateScheme {
    private String period = "квартал";
    private final int quantityMonths = 3;
    private double income, costs, result = 0;
    public void ShowProfitability() {
        ShowMessage(period);
        income = InputIncome(quantityMonths);
        costs = InputCosts(quantityMonths);
        result = CalculateProfitability(income, costs);
        ShowResult(period, result);
    }
}
