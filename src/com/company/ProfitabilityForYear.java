package com.company;
//подкласс полобный подклассу расчета рентабельности за месяц, только здесь расчет показателей за год
    public class ProfitabilityForYear extends CalculateScheme {
        private String period = "месяц";
        //переменная принимет значение 12 - т.к. расчеты выполняются за год.
    //Ввод показатей осуществляется 12 раз (по 12 на доходы и расходы)
        private final int quantityMonths = 12;
        private double income, costs, result = 0;
        public void ShowProfitability() {
            ShowMessage(period);
            income = InputIncome(quantityMonths);
            costs = InputCosts(quantityMonths);
            result = CalculateProfitability(income, costs);
            ShowResult(period, result);
        }
}
