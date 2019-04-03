package com.company;
//Интерфейс формулы расчета рентабельности
public interface InterfaceCalculateFormulas {
    //Базовый метод расчета рентабельности (Общая формула)
    default double Calculate(double income, double costs) {
        return (income/costs) * 100;
    }
}

