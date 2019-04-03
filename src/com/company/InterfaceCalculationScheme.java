package com.company;
//Пример скелета алгоритама на примере интерфейса (суть паттерна)
public interface InterfaceCalculationScheme{
    //Метод вывода сообщения о задании
    void ShowMessage(String title);
    //Ввод доходов
    double InputIncome(int n);
    //Ввод расходов
    double InputCosts(int n);
    //Расчет рентабельности
    double CalculateProfitability(double income, double costs);
    //Вывод результатов
    void ShowResult(String message, double result);
}
