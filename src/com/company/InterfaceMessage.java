package com.company;

//Интерфейс служащий для вывода сообщений.
public interface InterfaceMessage {
    //Метод для вывода данных о задаче
    void Show(String message, String title);
    //Общий для ввода расходов и доходов
    String InputDate(String title, String message);
    //Метод  для вывода результатов
    void Show(String message);
}
