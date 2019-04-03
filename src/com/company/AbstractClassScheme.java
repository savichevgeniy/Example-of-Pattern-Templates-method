package com.company;
// Скелет алгоритма расчета данных на примере абстрактного класса.
//Абстрактный класс использует методы интерфейса со схемой расчета
public abstract class AbstractClassScheme implements InterfaceCalculationScheme {
    //Абстрактный метод демонстрирующий окно задания
    public abstract void ShowMessage(String title);
    //Ввод доходов
    public abstract double InputIncome(int n);
    //Ввод расходов
    public abstract double InputCosts(int n);
    //Расчет рентабельности
    public abstract double CalculateProfitability(double income, double costs);
    //Ввывод результата
    public abstract void ShowResult(String message, double result);
}
